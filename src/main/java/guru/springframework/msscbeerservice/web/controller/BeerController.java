package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId){
        //todo: impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
        //todo: impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handlePut(@PathVariable UUID beerId, @RequestBody BeerDto beerDto){
        //todo: impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
