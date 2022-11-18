package br.com.algaworks.algafood.jpa;

import br.com.algaworks.algafood.AlgafoodApiApplication;
import br.com.algaworks.algafood.domain.model.Cozinha;
import br.com.algaworks.algafood.domain.model.Restaurante;
import br.com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

public class AlteracaoRestauranteMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNome("Jiló");
        restaurante.setTaxaFrete(BigDecimal.valueOf(6.1));
        Cozinha cozinha = new Cozinha();
        cozinha.setId(1L);
        restaurante.setCozinha(cozinha);

        restaurante = restauranteRepository.adicionar(restaurante);
        System.out.printf("Atualzado restaurante id: %d nome: %s taxa frete: %s nome cozinha %s\n",
                restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
    }
}
