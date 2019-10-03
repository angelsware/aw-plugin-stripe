#include <stripe/aw_stripefactory.h>
#include "aw_stripe_android.h"

namespace Stripe {
	IStripe* CStripeFactory::create() {
		return new CStripe_Android();
	}

	void CStripeFactory::destroy(IStripe* stripe) {
		delete stripe;
	}
}
