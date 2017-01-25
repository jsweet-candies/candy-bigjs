package def.big_js;

public class Big {

  public Big(double value) {
  }

  public Big(String value) {
  }

  public Big(Big value) {
  }

  /**
   * The maximum number of decimal places of the results of operations involving
   * division. It is relevant only to the div and sqrt methods, and the pow
   * method when the exponent is negative.
   * 
   * @default 40
   */
  public double DP;
  /**
   * The rounding mode used in the above operations and by round, toExponential,
   * toFixed and toPrecision. Default is RoundTowardsNearestAwayFromZero
   * 
   * @default 1
   */
  public RoundingMode RM;

  /**
   * Returns a Big number whose value is the absolute value, i.e. the magnitude,
   * of this Big number.
   */
  native public Big abs();

  /**
   * Compare
   * 
   * @returns {Number} 1 = If the value of this Big number is greater than the
   *          value of n -1 = If the value of this Big number is less than the
   *          value of n 0 = If this Big number and n have the same value
   */
  native public double cmp(double n);

  /**
   * Returns a Big number whose value is the value of this Big number divided by
   * n.
   */
  native public Big div(double n);

  /**
   * Returns true if the value of this Big equals the value of n, otherwise
   * returns false.
   */
  native public Boolean eq(double n);

  /**
   * Returns true if the value of this Big is greater than the value of n,
   * otherwise returns false.
   */
  native public Boolean gt(double n);

  /**
   * Returns true if the value of this Big is greater than or equal to the value
   * of n, otherwise returns false.
   */
  native public Boolean gte(double n);

  /**
   * Returns true if the value of this Big is less than the value of n,
   * otherwise returns false.
   */
  native public Boolean lt(double n);

  /**
   * Returns true if the value of this Big is less than or equal to the value of
   * n, otherwise returns false.
   */
  native public Boolean lte(double n);

  /**
   * Returns a Big number whose value is the value of this Big number minus n.
   */
  native public Big minus(double n);

  /**
   * Returns a Big number whose value is the value of this Big number modulo n,
   * i.e. the integer remainder of dividing this Big number by n. The result
   * will have the same sign as this Big number, and it will match that of
   * Javascript's % operator (within the limits of its precision) and
   * BigDecimal's remainder method.
   */
  native public Big mod(double n);

  /**
   * Returns a Big number whose value is the value of this Big number plus n.
   */
  native public Big plus(double n);

  /**
   * Returns a Big number whose value is the value of this Big number raised to
   * the power exp. If exp is negative and the result has more fraction digits
   * than is specified by Big.DP, it will be rounded to Big.DP decimal places
   * using rounding mode Big.RM.
   * 
   * @param exp
   *          integer, -1e+6 to 1e+6 inclusive
   */
  native public Big pow(double exp);

  /**
   * Returns a Big number whose value is the value of this Big number rounded to
   * a whole number.
   */
  native public Big round();

  /**
   * Returns a Big number whose value is the value of this Big number rounded
   * using rounding mode rm to a maximum of dp decimal places.
   * 
   * @param dp
   *          Number of decimal places (0 to 1e+6 inclusive). If dp is omitted
   *          or is null or undefined, the return value is n rounded to a whole
   *          number.
   */
  native public Big round(double dp);

  /**
   * Returns a Big number whose value is the value of this Big number rounded
   * using rounding mode rm to a maximum of dp decimal places.
   * 
   * @param dp
   *          Number of decimal places (0 to 1e+6 inclusive). If dp is omitted
   *          or is null or undefined, the return value is n rounded to a whole
   *          number.
   * @param rm
   *          Rounding mode. If rm is omitted or is null or undefined, the
   *          current Big.RM setting is used.
   */
  native public Big round(double dp, RoundingMode rm);

  /** Returns a Big number whose value is the square root of this Big number. */
  native public Big sqrt();

  /**
   * Returns a Big number whose value is the value of this Big number times n.
   */
  native public Big times(double n);

  /**
   * Returns a string representing the value of this Big number in exponential
   * notation to a fixed number of decimal places dp.
   */
  native public String toExponential();

  /**
   * Returns a string representing the value of this Big number in exponential
   * notation to a fixed number of decimal places dp.
   * 
   * @param dp
   *          Number of decimal places (0 to 1e+6 inclusive). If dp is omitted,
   *          or is null or undefined, the number of digits after the decimal
   *          point defaults to the minimum number of digits necessary to
   *          represent the value exactly.
   */
  native public String toExponential(double dp);

  /**
   * Returns a string representing the value of this Big number in normal
   * notation to a fixed number of decimal places dp.
   */
  native public String toFixed();

  /**
   * Returns a string representing the value of this Big number in normal
   * notation to a fixed number of decimal places dp.
   * 
   * @param dp
   *          Number of decimal places (0 to 1e+6 inclusive). If dp is omitted,
   *          or is null or undefined, then the return value is simply the value
   *          in normal notation. This is also unlike Number.prototype.toFixed,
   *          which returns the value to zero decimal places.
   */
  native public String toFixed(double dp);

  /**
   * Returns a string representing the value of this Big number to the specified
   * number of significant digits sd.
   */
  native public String toPrecision();

  /**
   * Returns a string representing the value of this Big number to the specified
   * number of significant digits sd.
   * 
   * @param sd
   *          significant digits. If sd is omitted, or is null or undefined,
   *          then the return value is the same as .toString().
   */
  native public String toPrecision(double sd);

  /** Returns a string representing the value of this Big number. */
  native public String toString();

  /** As toString. */
  native public String valueOf();

  /** As toString. */
  native public String toJSON();

  /** coefficient (significand) */
  public double[] c;
  /** exponent (Integer, -1e+6 to 1e+6 inclusive) */
  public double e;
  /** sign (-1 or 1) */
  public double s;

  /**
   * Compare
   * 
   * @returns {Number} 1 = If the value of this Big number is greater than the
   *          value of n -1 = If the value of this Big number is less than the
   *          value of n 0 = If this Big number and n have the same value
   */
  native public double cmp(Big n);

  /**
   * Compare
   * 
   * @returns {Number} 1 = If the value of this Big number is greater than the
   *          value of n -1 = If the value of this Big number is less than the
   *          value of n 0 = If this Big number and n have the same value
   */
  native public double cmp(String n);

  /**
   * Returns a Big number whose value is the value of this Big number divided by
   * n.
   */
  native public Big div(String n);

  /**
   * Returns a Big number whose value is the value of this Big number divided by
   * n.
   */
  native public Big div(Big n);

  /**
   * Returns true if the value of this Big equals the value of n, otherwise
   * returns false.
   */
  native public Boolean eq(Big n);

  /**
   * Returns true if the value of this Big equals the value of n, otherwise
   * returns false.
   */
  native public Boolean eq(String n);

  /**
   * Returns true if the value of this Big is greater than the value of n,
   * otherwise returns false.
   */
  native public Boolean gt(Big n);

  /**
   * Returns true if the value of this Big is greater than the value of n,
   * otherwise returns false.
   */
  native public Boolean gt(String n);

  /**
   * Returns true if the value of this Big is greater than or equal to the value
   * of n, otherwise returns false.
   */
  native public Boolean gte(Big n);

  /**
   * Returns true if the value of this Big is greater than or equal to the value
   * of n, otherwise returns false.
   */
  native public Boolean gte(String n);

  /**
   * Returns true if the value of this Big is less than the value of n,
   * otherwise returns false.
   */
  native public Boolean lt(Big n);

  /**
   * Returns true if the value of this Big is less than the value of n,
   * otherwise returns false.
   */
  native public Boolean lt(String n);

  /**
   * Returns true if the value of this Big is less than or equal to the value of
   * n, otherwise returns false.
   */
  native public Boolean lte(Big n);

  /**
   * Returns true if the value of this Big is less than or equal to the value of
   * n, otherwise returns false.
   */
  native public Boolean lte(String n);

  /**
   * Returns a Big number whose value is the value of this Big number minus n.
   */
  native public Big minus(Big n);

  /**
   * Returns a Big number whose value is the value of this Big number minus n.
   */
  native public Big minus(String n);

  /**
   * Returns a Big number whose value is the value of this Big number modulo n,
   * i.e. the integer remainder of dividing this Big number by n. The result
   * will have the same sign as this Big number, and it will match that of
   * Javascript's % operator (within the limits of its precision) and
   * BigDecimal's remainder method.
   */
  native public Big mod(Big n);

  /**
   * Returns a Big number whose value is the value of this Big number modulo n,
   * i.e. the integer remainder of dividing this Big number by n. The result
   * will have the same sign as this Big number, and it will match that of
   * Javascript's % operator (within the limits of its precision) and
   * BigDecimal's remainder method.
   */
  native public Big mod(String n);

  /**
   * Returns a Big number whose value is the value of this Big number plus n.
   */
  native public Big plus(String n);

  /**
   * Returns a Big number whose value is the value of this Big number plus n.
   */
  native public Big plus(Big n);

  /**
   * Returns a Big number whose value is the value of this Big number times n.
   */
  native public Big times(Big n);

  /**
   * Returns a Big number whose value is the value of this Big number times n.
   */
  native public Big times(String n);
}
