package ducnhu.eshopmini.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import ducnhu.eshopmini.payload.StripePaymentDto;

public interface StripeService {

    PaymentIntent paymentIntent(StripePaymentDto stripePaymentDto) throws StripeException;
}
