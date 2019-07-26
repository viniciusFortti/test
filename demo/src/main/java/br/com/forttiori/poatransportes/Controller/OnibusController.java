package br.com.forttiori.poatransportes.Controller;

import br.com.forttiori.poatransportes.Service.OnibusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/onibus")
@Slf4j
public class OnibusController {

    @Autowired
    OnibusService onibusService;

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<br.com.forttiori.poatransportes.Model.Onibus>> buscarPorNome(@PathVariable String nome) throws IOException {
        return ResponseEntity.ok(onibusService.buscarPorNome(nome));
    }

    @GetMapping("/integracao")
        public ResponseEntity<List<br.com.forttiori.poatransportes.Model.Onibus>> integrarBancoComAPI() throws IOException {
        return ResponseEntity.ok(onibusService.integrarBancoComAPI());
    }

    @GetMapping("/todos")
    public ResponseEntity<List<br.com.forttiori.poatransportes.Model.Onibus>> todas() throws IOException {
        return ResponseEntity.ok(onibusService.buscarTodasAsLinhasAPI());
    }


}