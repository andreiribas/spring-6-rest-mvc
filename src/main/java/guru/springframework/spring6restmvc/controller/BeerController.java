package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;


    public Beer getBeerById(UUID id) {

        log.debug("getBeerById controller...");

        return beerService.getBeerById(id);

    }

}
