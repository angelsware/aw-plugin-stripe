#ifndef __AW_STRIPE_STRIPE_FACTORY_H__
#define __AW_STRIPE_STRIPE_FACTORY_H__

namespace Stripe {
	class IStripe;

	class CStripeFactory {
	public:
		static IStripe* create();
		static void destroy(IStripe* stripe);
	};
}

#endif

