Para executar esse projeto é necessario ter o postgreSQL instalado de alguma
forma na maquina(Os dados de conexão estão no arquivo "application.properties"
em "src/main/resources").

As requisições devem ser mandadas para "http://localhost:8080/api/entregas"
Em caso de delete ou para encontrar uma unica linha adicionar "/id" ao final
do endpoint



Este é meu primeiro projeto backend utilizando Java, por isso eu não tinha
exemplos já construídos para usar como repertório. Porém vou deixar aqui
alguns aprimoramentos que eu acho interessante implementar mas por ser uma
versão quase legada, o receio de desconcertar a aplicação e a dificuldade para
encontrar referencias para o java 8, foram maiores.

1 - Criação de tabelas e modelos especificos para Entregadores e Destinatários 
2 - Implementar camada de serviços
3 - Implementar middlewares de segurança para o destroy
 e checagem de dados repetidos nas funções de create e update
4 - Implementar alguma criptografia de chave publica ou blockchain para
 confirmar entregas e despachos.