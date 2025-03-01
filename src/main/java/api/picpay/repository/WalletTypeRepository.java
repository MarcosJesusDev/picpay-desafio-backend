package api.picpay.repository;


import api.picpay.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRepository extends JpaRepository <WalletType, Long>{
}
