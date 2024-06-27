package br.com.mikael.NossoCine.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
