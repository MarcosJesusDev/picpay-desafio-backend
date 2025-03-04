package api.picpay.controller.dto;

import api.picpay.entity.Wallet;
import api.picpay.entity.WalletType;

public record CrateWalletDto (String fullName,
                             String cpfCnpj,
                             String email,
                             String password,
                             WalletType.Enum walletType){

    public Wallet toWallet(){
        return new Wallet(

        );
    }
}
