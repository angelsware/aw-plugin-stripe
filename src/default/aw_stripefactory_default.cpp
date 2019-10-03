#include <stripe/aw_stripefactory.h>
#include "aw_stripe_default.h"

namespace Stripe {
	IStripe* CStripeFactory::create() {
		return new CStripe_Default();
	}

	void CStripeFactory::destroy(IStripe* stripe) {
		delete stripe;
	}
}
