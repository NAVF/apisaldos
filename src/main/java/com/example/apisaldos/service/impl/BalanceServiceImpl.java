package com.example.apisaldos.service.impl;

import com.example.apisaldos.domain.entity.Balance;
import com.example.apisaldos.dto.UpdateBalanceDto;
import com.example.apisaldos.exceptions.CatalogErrors;
import com.example.apisaldos.repository.BalanceRepository;
import com.example.apisaldos.service.BalanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class BalanceServiceImpl implements BalanceService {

    private final BalanceRepository balanceRepository;

    @Override
    public Balance getBalanceUser(Long userId) {
        Optional<Balance> optBalance = balanceRepository.findByUserId(userId);
        if(optBalance.isEmpty()) throw CatalogErrors.BALANCE_BALANCE_E404_001.getException();

        return optBalance.get();
    }

    @Override
    public Balance updateBalance(Long id, UpdateBalanceDto updateBalanceDto) {
        log.info("Validación de existencia de saldo. id: {} - data: {}",id, updateBalanceDto);
        Optional<Balance> optBalance = balanceRepository.findById(id);
        if(optBalance.isEmpty()) throw CatalogErrors.BALANCE_BALANCE_E404_002.getException();

        log.info("Actualización de saldo.");
        Balance balance = optBalance.get();
        balance.setBalance(balance.getBalance() - updateBalanceDto.getAmount());
        balanceRepository.save(balance);

        return balance;
    }

    @Override
    public Balance returnAmount(Long id, UpdateBalanceDto updateBalanceDto) {
        log.info("Validación de existencia de saldo. id: {} - data: {}",id, updateBalanceDto);
        Optional<Balance> optBalance = balanceRepository.findById(id);
        if(optBalance.isEmpty()) throw CatalogErrors.BALANCE_BALANCE_E404_002.getException();

        log.info("Extorno de monto sobre saldo.");
        Balance balance = optBalance.get();
        balance.setBalance(balance.getBalance() + updateBalanceDto.getAmount());
        balanceRepository.save(balance);

        return balance;
    }
}
