package com.stacktogif.demo.controllers;
import com.stacktogif.demo.gifs.Gifs;
import com.stacktogif.demo.stackexchange.RatesResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import java.util.*;


@Controller
public class MainController {
    public String inputNumberOfDays;
    public String rate;


    @PostMapping("/form")
    public String saveForm(@RequestParam(value = "email") String input, @RequestParam(value = "status") String rateInput) {
        inputNumberOfDays = input;
        rate = rateInput;
        System.out.println("The form input is: " + inputNumberOfDays);
        System.out.println("The rate input is: " + rate);

        return "redirect:/";
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(value="name", required = false) String amountOfDaysLink) {

        //	reading days first from url then from input on page
        int amountOfDays;
        try {
            amountOfDays = Integer.parseInt(amountOfDaysLink);
        } catch (Exception e) {
            try {
                amountOfDays = Integer.parseInt(inputNumberOfDays);
            } catch (Exception ex) {
                amountOfDays = 1; //default
            }
        }
        //	reading days first from input on page
        String exchangeRateSpec;
        try {
            exchangeRateSpec = rate.toString();
        } catch (Exception ex) {
            exchangeRateSpec = "USD"; //default
        }

        RestTemplate restTemplate = new RestTemplate();
        //parsing rates for today
        String apiStackExKey = "7ef595540eb2404ab25193eec7a6a603"; //change api key here
        String jsonRatesTodayURL = "https://openexchangerates.org/api/latest.json?app_id=" + apiStackExKey;
        RatesResponse ratesToday = restTemplate.getForObject(jsonRatesTodayURL, RatesResponse.class);
        //parsing rates for chosen date
        String jsonRatesYesterdayURL = "https://openexchangerates.org/api/historical/" + LocalDate.now().minusDays(amountOfDays) + ".json?app_id=" + apiStackExKey;
        RatesResponse ratesYesterday = restTemplate.getForObject(jsonRatesYesterdayURL, RatesResponse.class);
        //creating array of available rates to display in select
        ArrayList<String> namesRates = new ArrayList<>(ratesToday.getRates().keySet());

        //calculating all values to compare
        double comparingValue = Double.parseDouble(ratesToday.getRates().get(exchangeRateSpec).toString()); //rate of comparing value today
        double oneRUBCompare = comparingValue / (double) ratesToday.getRates().get("RUB"); // 1 ruble in comparing value today
        double comparingValueYesterday = Double.parseDouble(ratesYesterday.getRates().get(exchangeRateSpec).toString()); //rate of comparing value for chosen date
        double oneRUBCompareYesterday = comparingValueYesterday / (Double) ratesYesterday.getRates().get("RUB"); // 1 ruble in comparing for chosen date

        //choosing a tag to search
        String richBroke;
        if (oneRUBCompare > oneRUBCompareYesterday)  richBroke = "rich";
        else richBroke = "broke";

        // Giphy
        String apiGiphyKey = "WuJjckB75aXB4nruBShg7e0t4UZVqJ3h"; //change api key here
        int offset = 0; //offset value (if you want to mix up things)
        int limit = 25; // giphy returns max of 50 gifs
        int upperbound = limit + offset; //creating upperbound for request
        Random r = new Random();
        int selectRand = r.nextInt(upperbound - offset - 1);
        String jsonGiphyURL = "https://api.giphy.com/v1/gifs/search?api_key=" + apiGiphyKey + "&q=" + richBroke + "&limit=" + upperbound + "&offset=" + offset + "&rating=g&lang=en";
        Gifs responseGiphy = restTemplate.getForObject(jsonGiphyURL, Gifs.class);
        String gifLink = responseGiphy.getData().get(selectRand).getImages().getFixedHeight().getUrl();

        model.addAttribute("gifLink", gifLink);
        model.addAttribute("RUBrate", oneRUBCompare);
        model.addAttribute("RUBrateBack", oneRUBCompareYesterday);
        model.addAttribute("amountOfDays", amountOfDays);
        model.addAttribute("comparingDate", LocalDate.now().minusDays(amountOfDays));
        model.addAttribute("rates", namesRates);
        model.addAttribute("rateCurrent", exchangeRateSpec);

        return "home";
    }
}