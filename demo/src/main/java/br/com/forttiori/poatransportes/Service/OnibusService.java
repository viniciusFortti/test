package br.com.forttiori.poatransportes.Service;

import br.com.forttiori.poatransportes.Repository.OnibusRepository;
import br.com.forttiori.poatransportes.Model.Onibus;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class OnibusService {

    @Autowired
    OnibusRepository onibusRepository;

    public List<Onibus> buscarPorNome(String nome) {
        return onibusRepository.findByNomeIgnoreCase(nome);
    }

    @Transactional(readOnly = false)
    public List<Onibus> integrarBancoComAPI() throws IOException {
        List<Onibus> linhasAPI = buscarTodasAsLinhasAPI();
        for (Onibus dto : linhasAPI) {
            onibusRepository.save(dto);
        }
        return onibusRepository.findAll();
    }

    public List<Onibus> buscarTodasAsLinhasAPI() throws IOException {
        URL url = new URL("http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=%&t=o");
        InputStream json = url.openStream();
        Gson gson = new Gson();
        Type tipoListaLinhas = new TypeToken<List<Onibus>>(){}.getType();
        return gson.fromJson(new InputStreamReader(json, StandardCharsets.UTF_8), tipoListaLinhas);
    }


}
