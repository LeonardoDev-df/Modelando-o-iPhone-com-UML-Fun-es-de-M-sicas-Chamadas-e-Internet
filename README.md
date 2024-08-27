# Diagrama de Classes UML: iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet

## Descrição

Este projeto modela os papéis do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet usando um diagrama de classes UML. Abaixo estão as classes e interfaces utilizadas para essa modelagem.

## Classes e Interfaces

### 1. **Dispositivo** (Classe abstrata)
   - **Atributos**:
     - `marca`
     - `modelo`
     - `capacidadeBateria`
   - **Métodos**:
     - `ligar()`
     - `desligar()`
     - `recarregar()`

### 2. **IReprodutorMusical** (Interface)
   - **Métodos**:
     - `tocarMusica()`
     - `pausarMusica()`
     - `selecionarMusica()`

### 3. **IAparelhoTelefonico** (Interface)
   - **Métodos**:
     - `fazerChamada()`
     - `atenderChamada()`
     - `encerrarChamada()`

### 4. **INavegadorInternet** (Interface)
   - **Métodos**:
     - `abrirPagina()`
     - `adicionarFavorito()`
     - `exibirHistorico()`

### 5. **iPhone** (Classe concreta)
   - **Descrição**: Herda de `Dispositivo` e implementa as interfaces `IReprodutorMusical`, `IAparelhoTelefonico` e `INavegadorInternet`.
   - **Métodos**:
     - Implementa todos os métodos das interfaces mencionadas.

## Diagrama de Classes

- **Dispositivo** é a classe base da qual **iPhone** herda.
- **iPhone** implementa as interfaces **IReprodutorMusical**, **IAparelhoTelefonico** e **INavegadorInternet**.

## Diagrama UML

Este diagrama de classes UML representa os papéis do iPhone conforme descrito acima.

![uml_diagram_iphone](https://github.com/user-attachments/assets/6a02c782-d28b-4e9e-a474-da5617d4873d)
