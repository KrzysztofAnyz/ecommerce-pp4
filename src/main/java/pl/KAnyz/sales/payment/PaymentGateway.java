package pl.KAnyz.sales.payment;

public interface PaymentGateway {
    RegisterPaymentResponse register(RegisterPaymentRequest registerPaymentRequest);
}
