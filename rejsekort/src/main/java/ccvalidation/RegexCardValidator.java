package ccvalidation;
//package validation;
//
//public class RegexCardValidator {
//	/**
//	 * Checks if the field is a valid credit card number.
//	 * 
//	 * @param card
//	 *            The card number to validate.
//	 * @return Whether the card number is valid.
//	 * 
//	 */
//
//
//	public CreditCardValidationResult isValid(final String cardIn) {
//		String card = cardIn.replaceAll("[^0-9]+", ""); // remove all
//														// non-numerics
//		if ((card == null) || (card.length() < 13) || (card.length() > 19)) {
//			return new CreditCardValidationResult(card, "failed length check");
//		}
//
//		if (!luhnCheck(card)) {
//			return new CreditCardValidationResult(card, "failed luhn check");
//		}
//
//		CreditCardCompany cc = CreditCardCompany.gleanCompany(card);
//		if (cc == null)
//			return new CreditCardValidationResult(card, "failed card company check");
//		
//		
//		return new CreditCardValidationResult(card, cc);
//	}
//
//	/
//
//
//}
