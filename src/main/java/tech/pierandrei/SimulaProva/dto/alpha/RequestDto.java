/*
 * Copyright (c) 2025 SimulaProva
 * Autor: Henrique Pierandrei
 * Este código é propriedade de SimulaProva
 * Todos os direitos reservados.
 * É proibida a reprodução, distribuição ou uso não autorizado
 * deste código sem permissão explícita por escrito.
 */

package tech.pierandrei.SimulaProva.dto.alpha;

import com.fasterxml.jackson.annotation.JsonProperty;
import tech.pierandrei.SimulaProva.enuns.DificuldadeDaPerguntaEnum;

/**
 *
 * @param dificuldadeDaPergunta - Dificuldade das perguntas escolhida pelo usuário (FACIL, MEDIO, DIFICIL)
 * @param quantidadeDePerguntas - Quantidade de perguntas escolhida pelo usuário ( 0 < quantidadeDePerguntas <= 10)
 * @param temaDasPerguntas - Tema das perguntas escolhida pelo usuário
 */
public record RequestDto(
        @JsonProperty("dificuldade_da_pergunta")
        DificuldadeDaPerguntaEnum dificuldadeDaPergunta,

        @JsonProperty("quantidade_de_perguntas")
        int quantidadeDePerguntas,

        @JsonProperty("tema_das_perguntas")
        String temaDasPerguntas

) {
    public RequestDto {
        // Exemplo de formatação do tema das perguntas
        if (temaDasPerguntas != null && !temaDasPerguntas.startsWith("O tema das perguntas:")) {
            temaDasPerguntas = "O tema das perguntas: " + temaDasPerguntas;
        }
    }
}
