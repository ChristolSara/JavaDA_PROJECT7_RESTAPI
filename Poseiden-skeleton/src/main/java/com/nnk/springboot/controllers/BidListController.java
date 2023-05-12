package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.domain.User;
import com.nnk.springboot.repositories.BidListRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class BidListController {
    // TODO: Inject Bid service

    private BidListRepository bidListRepository;
    @RequestMapping("/bidList/list")
    public String home(Model model)
    {
        // TODO: call service find all bids to show to the view
        model.addAttribute("bidLists", bidListRepository.findAll());
        return "bidList/list";
    }

    @GetMapping("/bidList/add")
    public String addBidForm(BidList bid) {
        bidListRepository.save(bid);
        return "bidList/add";
    }

    @PostMapping("/bidList/validate")
    public String validate(@Valid BidList bid, BindingResult result, Model model) {
        // TODO: check data valid and save to db, after saving return bid list


            //  BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            // user.setPassword(encoder.encode(user.getPassword()));

            bidListRepository.save(bid);
            model.addAttribute("BidList", bidListRepository.findAll());
            return "redirect:/bidList/list";

    }

    @GetMapping("/bidList/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        // TODO: get Bid by Id and to model then show to the form
        BidList bidList = bidListRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid bidList:" + id));
        model.addAttribute("bidList", bidList);
        return "bidList/update";
    }

    @PostMapping("/bidList/update/{id}")
    public String updateBid(@PathVariable("id") Integer id, @Valid BidList bidList,
                             BindingResult result, Model model) {
        // TODO: check required fields, if valid call service to update Bid and return list Bid

        if (result.hasErrors()) {
            return "bidList/update";
        }

        //  BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // user.setPassword(encoder.encode(user.getPassword()));

        bidListRepository.save(bidList);
        model.addAttribute("bidLists", bidListRepository.findAll());
        return "redirect:/bidList/list";
    }

    @GetMapping("/bidList/delete/{id}")
    public String deleteBid(@PathVariable("id") Integer id, Model model) {
        // TODO: Find Bid by Id and delete the bid, return to Bid list
        BidList bid = bidListRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Bid Id:" + id));
        bidListRepository.delete(bid);
        return "redirect:/bidList/list";
    }
}
