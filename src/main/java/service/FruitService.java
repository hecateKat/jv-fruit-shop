package service;

import model.FruitTransaction;

import java.util.List;

public interface FruitService {

    void processTransactions(List<FruitTransaction> fruitTransactions);
}