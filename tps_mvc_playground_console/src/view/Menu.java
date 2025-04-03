package view;

public class Menu {
    //ContatoController controller;

    public Menu(){
      //  controller = null;
    }

    public void escrever(){
        String menu = """
                +---------------+
                |1. Criar       |
                |2. Listar      |
                |3. Buscar      |
                |4. Atualizar   |
                |5. Excluir     |
                |6. Sair        |
                +---------------+
                """;
        System.out.println(menu);

    }

    public void Criar(){
        controller.criar();
    }

    public void Listar(){
        controller.listar();
    }

    public void Buscar(){
        controller.buscar();
    }

    public void Atualizar(){
        controller.atualizar();
    }

    public void Excluir(){
        controller.excluir();
    }

    public void Sair(){
        controller.sair():
    }


}
