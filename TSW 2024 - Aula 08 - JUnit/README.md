## @BeforeEach
Usamos a anotação @BeforeEach para criar uma instância da classe Calculadora antes de cada teste. Isso garante que cada teste seja executado em um ambiente limpo e independente.

## @Test
Cada método de teste é anotado com @Test e contém asserções usando o método assertEquals da classe Assertions para verificar se os resultados retornados pelos métodos da Calculadora são os esperados.

## assertThrows
No testDividirPorZero, usamos o método assertThrows da classe Assertions para verificar se uma exceção ArithmeticException é lançada quando ocorre uma divisão por zero.
    
