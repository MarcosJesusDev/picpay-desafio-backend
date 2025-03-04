package api.picpay.controller;

import api.picpay.entity.Wallet;
import api.picpay.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }


    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody){

    }
}
