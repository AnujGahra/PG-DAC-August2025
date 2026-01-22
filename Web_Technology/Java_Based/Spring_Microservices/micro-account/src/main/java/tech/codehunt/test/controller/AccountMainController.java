package tech.codehunt.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import tech.codehunt.test.dto.AccountDto;
import tech.codehunt.test.entities.Account;
import tech.codehunt.test.payload.ApiResponse;
import tech.codehunt.test.services.AccountService;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountMainController {

    private final AccountService accountService;

    // Save Account
    @PostMapping
    public ResponseEntity<ApiResponse<Account>> saveAccount(
            @Valid @RequestBody AccountDto accountDto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(accountService.saveAccount(accountDto));
    }

    // Get All Accounts
    @GetMapping
    public ResponseEntity<ApiResponse<List<Account>>> getAllAccount() {
        return ResponseEntity.ok(accountService.getAllAccount());
    }

    // Get Single Account
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Account>> getSingleAccount(
            @PathVariable String id) {

        return ResponseEntity.ok(accountService.getSingleAccount(id));
    }
}
