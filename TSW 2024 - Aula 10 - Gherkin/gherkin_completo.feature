# 29/04/2024
# Profº Ms Gustavo Molina
# Teste de Software

Feature: Emissão de Certificado

    Eu, como aluno da plataforma,
    Gostaria de ter um certificado emitido, ao completar o curso,
    Pois, assim, consigo comprovar meus conhecimentos técnicos

Background: Estar matriculado no curso de Gherkin
Given que estou logado na plataforma 
And possuo matricula ativa

Scenario Outline: Emissão de certificado
And matriculado no curso <nomeCurso>
When finalizo o meu curso            
Then tenho o meu certificado emitido

Examples:
    | nomeCurso | 
    | "Gherkin do básico ao avançado" | 
    | "Metodologias Agéis" |
    | "Teste de software" |

Scenario: Curso em andamento
Given que estou logado na plataforma
And matriculado no curso de Gherkin
When assisto as aulas 
Then não tenho meu certificado disponível 
But possuo aulas assistidas          