package tech.codehunt.test.services;

import java.util.List;

import tech.codehunt.test.dto.AccountDto;
import tech.codehunt.test.entities.Account;
import tech.codehunt.test.payload.ApiResponse;

public interface AccountService {

    ApiResponse<Account> saveAccount(AccountDto accountDto);

    ApiResponse<List<Account>> getAllAccount();

    ApiResponse<Account> getSingleAccount(String id);
}
