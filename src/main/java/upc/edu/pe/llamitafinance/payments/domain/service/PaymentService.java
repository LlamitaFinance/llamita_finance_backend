package upc.edu.pe.llamitafinance.payments.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import upc.edu.pe.llamitafinance.payments.domain.model.entity.Payment;

import java.util.List;

public interface PaymentService {

    List<Payment> getAll();

    Page<Payment> getAll(Pageable pageable);

    Payment getById(Long PaymentId);

    Payment create(Payment payment);
}
