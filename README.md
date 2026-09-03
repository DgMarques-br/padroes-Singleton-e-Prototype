# Sistema de Secretaria Acadêmica

Este repositório contém a implementação da atividade de Modelagem de Padrões, contemplando os padrões Singleton e Prototype desenvolvidos em Java.

## Estrutura do Projeto

O sistema foi projetado para atender duas regras de negócio específicas da secretaria acadêmica na emissão de certificados de conclusão:

1. Controle da fila de impressão.
2. Otimização de recursos na geração dos certificados.

## Padrões de Projeto Aplicados

### Singleton (FilaDeImpressao)
Garante que exista apenas uma única instância da classe de impressão em toda a aplicação. Isso evita o conflito de documentos enviados simultaneamente e previne sobrecargas na impressora central. A instância é gerenciada de forma estática e acessada exclusivamente pelo método `getInstance()`.

### Prototype (Certificado)
Resolve o problema de lentidão no carregamento de dados a partir do banco de dados. Um certificado padrão ("molde") é instanciado apenas uma vez, contendo os dados imutáveis como o nome do curso. Para cada novo aluno, este molde é clonado em memória através do método `clonar()`, e apenas o nome do aluno é modificado através do método `setNomeAluno()`.

## Validação de Memória
O script de execução na classe `Main` inclui uma validação que testa a alocação de memória dos objetos gerados. A comparação `clone1 == clone2` resulta em `false`, provando que o processo de clonagem instanciou objetos em endereços de memória independentes, garantindo a integridade dos dados de cada aluno na emissão.
