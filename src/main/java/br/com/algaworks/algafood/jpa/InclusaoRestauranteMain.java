package br.com.algaworks.algafood.jpa;

import br.com.algaworks.algafood.AlgafoodApiApplication;
import br.com.algaworks.algafood.domain.model.Restaurante;
import br.com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class InclusaoRestauranteMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNome("Felipe");
        restaurante1.setTaxaFrete(BigDecimal.valueOf(5.3));

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNome("Fogo de Galpão");
        restaurante2.setTaxaFrete(BigDecimal.valueOf(4.1));

        restaurante1 = restauranteRepository.adicionar(restaurante1);
        restaurante2 = restauranteRepository.adicionar(restaurante2);

        System.out.printf("%d - %s - %s\n", restaurante1.getId(), restaurante1.getNome(), restaurante1.getTaxaFrete());
        System.out.printf("%d - %s - %s\n", restaurante2.getId(), restaurante2.getNome(), restaurante2.getTaxaFrete());



    }
}
