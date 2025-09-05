# 🍦 Gelatto App

Um aplicativo Android simples que simula o processo de realizar um pedido em uma sorveteria.  
O projeto foi desenvolvido com fins **educacionais**, para demonstrar o uso de **Activities**, **Intents** (explícitas e implícitas), **troca de dados entre telas** e manipulação de componentes visuais no Android.  

---

## 🚀 Funcionalidades

- **Tela Principal (MainActivity)**  
  - Seleção do **tipo de sorvete** (`Spinner`).  
  - Escolha do **sabor** (`RadioGroup` e `RadioButtons`).  
  - Definição da **quantidade** (`EditText`).  
  - Envio do pedido para a tela de resumo via **Intent Explícita**.  

- **Troca de dados entre telas**  
  - Uso de `putExtra()` e `Bundle` para transportar informações.  
  - Demonstração de boas práticas no uso de Intents.  

- **Tela de Pedido (PedidoActivity)**  
  - Recebe os dados da tela principal.  
  - Calcula o valor total com base no tipo escolhido.  
  - Exibe um resumo do pedido para o usuário.  
  - Botão **Voltar** → retorna para a tela principal.  

---

## 💻 Tecnologias Utilizadas

- **Linguagem:** Java / Kotlin  
- **IDE:** Android Studio  
- **Framework:** Android SDK  
- **Componentes de UI:**  
  - `Spinner`  
  - `RadioGroup`  
  - `RadioButton`  
  - `EditText`  
  - `Button`  
  - `TextView`  

---

## 📱 Demonstração do Fluxo

1. O usuário escolhe o tipo, sabor e quantidade do sorvete.  
2. Clica no botão **Confirmar Pedido**.  
3. A aplicação cria uma **Intent** e envia os dados para a segunda Activity.  
4. A segunda tela calcula o valor e exibe o **resumo do pedido**.  
5. O usuário pode voltar para a tela inicial e fazer outro pedido.  

---

## 💰 Tabela de Preços

- Cone → R$ 2,50  
- Cone Duplo → R$ 4,50  
- Picolé → R$ 1,50  
- Sundae → R$ 8,50  

---

## 🎯 Objetivos de Aprendizagem

- Entender o conceito de **Activity** como tela de um aplicativo.  
- Aprender a usar **Intents Explícitas** para navegação.  
- Enviar e receber dados entre telas com `putExtra()` e `getExtra()`.  
- Agrupar dados com **Bundle**.  
- Trabalhar com **layouts XML** e componentes visuais básicos.  

---

## 📚 Referências

- [Android Developers – Intents e Filtros](https://developer.android.com/guide/components/intents-filters?hl=pt-br)  
- [Android Developers – Activities](https://developer.android.com/guide/components/activities?hl=pt-br)  
- [Android Developers – Services](https://developer.android.com/guide/components/services?hl=pt-br)  

---

## 📝 Licença

Este projeto foi desenvolvido para fins **didáticos** e pode ser usado livremente em cursos e estudos relacionados a Android.  
<img width="1281" height="875" alt="image" src="https://github.com/user-attachments/assets/7920118a-26eb-45b2-8c64-4a1139aac913" />
