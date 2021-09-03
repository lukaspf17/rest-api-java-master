# Facebook API using Spring Boot

  

Ao digitar a url local: http://localhost:8080/

  

Será gerado as próximas etapas de urls para fazer os testes da api no browser ou no postman:

  

    [
           "http://localhost:8080/generateFacebookAuthorizeUrl",
           "http://localhost:8080/getUserData",
           "http://localhost:8080/getUserFeed",
           "http://localhost:8080/getUserAlbum",
           "http://localhost:8080/getUserAccounts",
           "http://localhost:8080/getUserGroupMembership"
    ]

  

Entrar na url:

  

http://localhost:8080/generateFacebookAuthorizeUrl

  

Através dos dados fornecidos da id do aplicativo e da chave secreta que foi inserida em application.properties, então será gerado uma chave de acesso para logar no facebook - https://www.facebook.com/v2.5/dialog/oauth?client_id=SuaIdFornecidaDoFacebook

  

Esta url que foi gerada de sua api que você coloca no seu browser ou no postman, e ficará como "logado"
|  |  |
|--|--|
|http://localhost:8080/getUserData|dados do facebook logado na api: id, first_name e name|
| http://localhost:8080/getUserFeed |  dados do seu feed |
| http://localhost:8080/getUserAlbum|dados do seu álbum |
|http://localhost:8080/getUserAccounts|conexão no facebook|
|http://localhost:8080/getUserGroupMembership|grupos do facebook|
|  |  |

## 📝 License

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.