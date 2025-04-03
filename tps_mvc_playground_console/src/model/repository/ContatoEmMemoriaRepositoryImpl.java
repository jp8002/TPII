package model.repository;

import model.ContatoVO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ContatoEmMemoriaRepositoryImpl implements iContatoRepository{
    private List<ContatoVO> contatoVO = new ArrayList<>();

    @Override
    public void salvar(ContatoVO contatoVO) {
        this.contatoVO.add(contatoVO);
        System.out.println("Contato criado com suceso");
    }

    @Override
    public void atualizar(ContatoVO contatoVO) {

    }

    @Override
    public void excluir(Integer id) {
        this.contatoVO
                .stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .ifPresent(c -> this.contatoVO.remove(c));
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return this.contatoVO
                .stream()
                .filter(c -> c.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return this.contatoVO;
    }
}