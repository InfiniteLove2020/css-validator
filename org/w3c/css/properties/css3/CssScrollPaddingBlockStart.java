//
// Author: Yves Lafon <ylafon@w3.org>
//
// (c) COPYRIGHT MIT, ERCIM, Keio, Beihang, 2017.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.css.properties.css3;

import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;

/**
 * @spec ttps://www.w3.org/TR/2017/CR-css-scroll-snap-1-20170824/#propdef-scroll-padding-block-start
 */
public class CssScrollPaddingBlockStart extends org.w3c.css.properties.css.CssScrollPaddingBlockStart {

	/**
	 * Create a new CssScrollPaddingBlockStart
	 */
	public CssScrollPaddingBlockStart() {
		value = initial;
	}

	/**
	 * Creates a new CssScrollPaddingBlockStart
	 *
	 * @param expression The expression for this property
	 * @throws org.w3c.css.util.InvalidParamException
	 *          Expressions are incorrect
	 */
	public CssScrollPaddingBlockStart(ApplContext ac, CssExpression expression, boolean check)
			throws InvalidParamException {
		setByUser();

		if (check && expression.getCount() > 1) {
			throw new InvalidParamException("unrecognize", ac);
		}
		value = CssScrollPadding.checkPaddingValue(ac, expression, this);
	}

	public CssScrollPaddingBlockStart(ApplContext ac, CssExpression expression)
			throws InvalidParamException {
		this(ac, expression, false);
	}

}

