package com.continuada.yugioh;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/deck")
public class DeckController {

    private List<Carta>baralho = new ArrayList<>();

    @GetMapping
    public List<Carta> mostrarDeck(){
        return baralho;
    }

    @PostMapping("/adicionar/magica")
    public void adicionarMagica(@RequestBody CartaMagica carta){
        baralho.add(carta);
    }

    @PostMapping("/adicionar/monstro")
    public void adicionarMonstro(@RequestBody CartaMonstro carta){
        baralho.add(carta);
    }

    @DeleteMapping("/remover/{id}")
    public void removerCarta(@PathVariable Integer id){
        baralho.remove(id-1);
    }

    @PutMapping("/atualizar/magica/{id}")
    public void atualizarCartaMagica(@RequestBody CartaMagica carta, @PathVariable Integer id){
        baralho.set(id-1, carta);
    }


    @PutMapping("/atualizar/monstro/{id}")
    public void atualizarCartaMonstro(@RequestBody CartaMonstro carta, @PathVariable Integer id){
        baralho.set(id-1, carta);
    }
}
