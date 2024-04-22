# 29/04/2024
# Profº Ms Gustavo Molina
# Teste de Software

Feature: Emissão de Certificado

    Eu, como aluno da plataforma,
    Gostaria de ter um certificado emitido, ao completar o curso,
    Pois, assim, consigo comprovar meus conhecimentos técnicos

Background: Estar matriculado no curso de Gherkin
Given que estou logado na plataforma 
And matriculado no curso de Gherkin 

Scenario: Emissão de certificado
When finalizo o meu curso            
Then tenho o meu certificado         

Scenario: Curso em andamento
Given que estou logado na plataforma
And matriculado no curso de Gherkin
When assisto as aulas 
Then não tenho meu certificado disponível 
But possuo aulas assistidas          