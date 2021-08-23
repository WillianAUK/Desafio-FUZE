# Desafio-FUZE
Desafio do processo seletivo para estágio FUZE

O objetivo é criar um cliente básico de Twitter em Kotlin . As funcionalidades principais serão: buscar por tweets com um texto específico, e mostrar os tweets de um usuário. De maneira mais detalhada:

1) A tela inicial do aplicativo deve conter uma tela de busca, com uma search bar no topo. Ao digitar um texto e confirmar, a busca deve ser realizada através do endpoint `search/tweets.json` (https://developer.twitter.com/en/docs/tweets/search/api-reference/get-search-tweets.html)
2) Durante a busca, um spinner deve ser mostrado na tela. Após o resultado, os tweets devem ser mostrados na ordem em que são retornados pela API
3) Ao tocar em um tweet, a página do usuário que postou o mesmo deve ser aberta, mostrando sua timeline, através do endpoint `statuses/user_timeline.json` (https://developer.twitter.com/en/docs/tweets/timelines/api-reference/get-statuses-user_timeline.html).
4) Na medida do possível, tente simular a interface do app do Twitter. De maneira mais específica, garanta que a imagem de perfil vai ser mostrada junto com o texto do tweet

#O que não foi concluído ainda.
- Não implementei as APIs por falta de entendimento ainda sobre elas;
- A tela de User timeline não foi desenvolvida;
- Possui bug na atual configuração de plotagem dos tweets na tela de vizualizar os mesmos;

#Considerações
- O design desenvolvido ficou de meu agrado, sendo somente necessário alguma "perfumaria"
- Primeira vez que trabalho com uma API nesse formato, então ainda possuo dúvidas de implemntação;
- Pretendo finalizar a aplicação e adicionar algumas pequenas funcionalidade e requisitos não funcionais.
