// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class PaymentMethodCreateParams extends ApiRequestParams {
  /**
   * If this is an {@code acss_debit} PaymentMethod, this hash contains details about the ACSS Debit
   * payment method.
   */
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /**
   * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm payment
   * method.
   */
  @SerializedName("affirm")
  Affirm affirm;

  /**
   * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
   * AfterpayClearpay payment method.
   */
  @SerializedName("afterpay_clearpay")
  AfterpayClearpay afterpayClearpay;

  /**
   * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay payment
   * method.
   */
  @SerializedName("alipay")
  Alipay alipay;

  /**
   * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the bank
   * account.
   */
  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  /**
   * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs Direct
   * Debit bank account.
   */
  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  /**
   * If this is a {@code bancontact} PaymentMethod, this hash contains details about the Bancontact
   * payment method.
   */
  @SerializedName("bancontact")
  Bancontact bancontact;

  /**
   * Billing information associated with the PaymentMethod that may be used or required by
   * particular types of payment methods.
   */
  @SerializedName("billing_details")
  BillingDetails billingDetails;

  /**
   * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
   * method.
   */
  @SerializedName("blik")
  Blik blik;

  /**
   * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto payment
   * method.
   */
  @SerializedName("boleto")
  Boleto boleto;

  /**
   * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
   * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
   * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card: {token:
   * "tok_visa"}}. When providing a card number, you must meet the requirements for <a
   * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
   * strongly recommend using Stripe.js instead of interacting with this API directly.
   */
  @SerializedName("card")
  Object card;

  /** The {@code Customer} to whom the original PaymentMethod is attached. */
  @SerializedName("customer")
  String customer;

  /**
   * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
   * CustomerBalance payment method.
   */
  @SerializedName("customer_balance")
  CustomerBalance customerBalance;

  /**
   * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
   * method.
   */
  @SerializedName("eps")
  Eps eps;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
   * method.
   */
  @SerializedName("fpx")
  Fpx fpx;

  /**
   * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
   * payment method.
   */
  @SerializedName("giropay")
  Giropay giropay;

  /**
   * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
   * payment method.
   */
  @SerializedName("grabpay")
  Grabpay grabpay;

  /**
   * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL payment
   * method.
   */
  @SerializedName("ideal")
  Ideal ideal;

  /**
   * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
   * Interac Present payment method.
   */
  @SerializedName("interac_present")
  InteracPresent interacPresent;

  /**
   * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna payment
   * method.
   */
  @SerializedName("klarna")
  Klarna klarna;

  /**
   * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
   * payment method.
   */
  @SerializedName("konbini")
  Konbini konbini;

  /**
   * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
   * method.
   */
  @SerializedName("link")
  Link link;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format. Individual keys can be unset by posting an empty value to them. All keys can
   * be unset by posting an empty value to {@code metadata}.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
   * method.
   */
  @SerializedName("oxxo")
  Oxxo oxxo;

  /**
   * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
   * method.
   */
  @SerializedName("p24")
  P24 p24;

  /** The PaymentMethod to share. */
  @SerializedName("payment_method")
  String paymentMethod;

  /**
   * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow payment
   * method.
   */
  @SerializedName("paynow")
  Paynow paynow;

  /**
   * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
   * method.
   */
  @SerializedName("pix")
  Pix pix;

  /**
   * If this is a {@code promptpay} PaymentMethod, this hash contains details about the PromptPay
   * payment method.
   */
  @SerializedName("promptpay")
  Promptpay promptpay;

  /**
   * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
   * Session</a> for more information.
   */
  @SerializedName("radar_options")
  RadarOptions radarOptions;

  /**
   * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA debit
   * bank account.
   */
  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  /**
   * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT payment
   * method.
   */
  @SerializedName("sofort")
  Sofort sofort;

  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name
   * matching this value. It contains additional information specific to the PaymentMethod type.
   */
  @SerializedName("type")
  Type type;

  /**
   * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the US
   * bank account payment method.
   */
  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  /**
   * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the wechat_pay
   * payment method.
   */
  @SerializedName("wechat_pay")
  WechatPay wechatPay;

  private PaymentMethodCreateParams(
      AcssDebit acssDebit,
      Affirm affirm,
      AfterpayClearpay afterpayClearpay,
      Alipay alipay,
      AuBecsDebit auBecsDebit,
      BacsDebit bacsDebit,
      Bancontact bancontact,
      BillingDetails billingDetails,
      Blik blik,
      Boleto boleto,
      Object card,
      String customer,
      CustomerBalance customerBalance,
      Eps eps,
      List<String> expand,
      Map<String, Object> extraParams,
      Fpx fpx,
      Giropay giropay,
      Grabpay grabpay,
      Ideal ideal,
      InteracPresent interacPresent,
      Klarna klarna,
      Konbini konbini,
      Link link,
      Map<String, String> metadata,
      Oxxo oxxo,
      P24 p24,
      String paymentMethod,
      Paynow paynow,
      Pix pix,
      Promptpay promptpay,
      RadarOptions radarOptions,
      SepaDebit sepaDebit,
      Sofort sofort,
      Type type,
      UsBankAccount usBankAccount,
      WechatPay wechatPay) {
    this.acssDebit = acssDebit;
    this.affirm = affirm;
    this.afterpayClearpay = afterpayClearpay;
    this.alipay = alipay;
    this.auBecsDebit = auBecsDebit;
    this.bacsDebit = bacsDebit;
    this.bancontact = bancontact;
    this.billingDetails = billingDetails;
    this.blik = blik;
    this.boleto = boleto;
    this.card = card;
    this.customer = customer;
    this.customerBalance = customerBalance;
    this.eps = eps;
    this.expand = expand;
    this.extraParams = extraParams;
    this.fpx = fpx;
    this.giropay = giropay;
    this.grabpay = grabpay;
    this.ideal = ideal;
    this.interacPresent = interacPresent;
    this.klarna = klarna;
    this.konbini = konbini;
    this.link = link;
    this.metadata = metadata;
    this.oxxo = oxxo;
    this.p24 = p24;
    this.paymentMethod = paymentMethod;
    this.paynow = paynow;
    this.pix = pix;
    this.promptpay = promptpay;
    this.radarOptions = radarOptions;
    this.sepaDebit = sepaDebit;
    this.sofort = sofort;
    this.type = type;
    this.usBankAccount = usBankAccount;
    this.wechatPay = wechatPay;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private AcssDebit acssDebit;

    private Affirm affirm;

    private AfterpayClearpay afterpayClearpay;

    private Alipay alipay;

    private AuBecsDebit auBecsDebit;

    private BacsDebit bacsDebit;

    private Bancontact bancontact;

    private BillingDetails billingDetails;

    private Blik blik;

    private Boleto boleto;

    private Object card;

    private String customer;

    private CustomerBalance customerBalance;

    private Eps eps;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Fpx fpx;

    private Giropay giropay;

    private Grabpay grabpay;

    private Ideal ideal;

    private InteracPresent interacPresent;

    private Klarna klarna;

    private Konbini konbini;

    private Link link;

    private Map<String, String> metadata;

    private Oxxo oxxo;

    private P24 p24;

    private String paymentMethod;

    private Paynow paynow;

    private Pix pix;

    private Promptpay promptpay;

    private RadarOptions radarOptions;

    private SepaDebit sepaDebit;

    private Sofort sofort;

    private Type type;

    private UsBankAccount usBankAccount;

    private WechatPay wechatPay;

    /** Finalize and obtain parameter instance from this builder. */
    public PaymentMethodCreateParams build() {
      return new PaymentMethodCreateParams(
          this.acssDebit,
          this.affirm,
          this.afterpayClearpay,
          this.alipay,
          this.auBecsDebit,
          this.bacsDebit,
          this.bancontact,
          this.billingDetails,
          this.blik,
          this.boleto,
          this.card,
          this.customer,
          this.customerBalance,
          this.eps,
          this.expand,
          this.extraParams,
          this.fpx,
          this.giropay,
          this.grabpay,
          this.ideal,
          this.interacPresent,
          this.klarna,
          this.konbini,
          this.link,
          this.metadata,
          this.oxxo,
          this.p24,
          this.paymentMethod,
          this.paynow,
          this.pix,
          this.promptpay,
          this.radarOptions,
          this.sepaDebit,
          this.sofort,
          this.type,
          this.usBankAccount,
          this.wechatPay);
    }

    /**
     * If this is an {@code acss_debit} PaymentMethod, this hash contains details about the ACSS
     * Debit payment method.
     */
    public Builder setAcssDebit(PaymentMethodCreateParams.AcssDebit acssDebit) {
      this.acssDebit = acssDebit;
      return this;
    }

    /**
     * If this is an {@code affirm} PaymentMethod, this hash contains details about the Affirm
     * payment method.
     */
    public Builder setAffirm(PaymentMethodCreateParams.Affirm affirm) {
      this.affirm = affirm;
      return this;
    }

    /**
     * If this is an {@code AfterpayClearpay} PaymentMethod, this hash contains details about the
     * AfterpayClearpay payment method.
     */
    public Builder setAfterpayClearpay(
        PaymentMethodCreateParams.AfterpayClearpay afterpayClearpay) {
      this.afterpayClearpay = afterpayClearpay;
      return this;
    }

    /**
     * If this is an {@code Alipay} PaymentMethod, this hash contains details about the Alipay
     * payment method.
     */
    public Builder setAlipay(PaymentMethodCreateParams.Alipay alipay) {
      this.alipay = alipay;
      return this;
    }

    /**
     * If this is an {@code au_becs_debit} PaymentMethod, this hash contains details about the bank
     * account.
     */
    public Builder setAuBecsDebit(PaymentMethodCreateParams.AuBecsDebit auBecsDebit) {
      this.auBecsDebit = auBecsDebit;
      return this;
    }

    /**
     * If this is a {@code bacs_debit} PaymentMethod, this hash contains details about the Bacs
     * Direct Debit bank account.
     */
    public Builder setBacsDebit(PaymentMethodCreateParams.BacsDebit bacsDebit) {
      this.bacsDebit = bacsDebit;
      return this;
    }

    /**
     * If this is a {@code bancontact} PaymentMethod, this hash contains details about the
     * Bancontact payment method.
     */
    public Builder setBancontact(PaymentMethodCreateParams.Bancontact bancontact) {
      this.bancontact = bancontact;
      return this;
    }

    /**
     * Billing information associated with the PaymentMethod that may be used or required by
     * particular types of payment methods.
     */
    public Builder setBillingDetails(PaymentMethodCreateParams.BillingDetails billingDetails) {
      this.billingDetails = billingDetails;
      return this;
    }

    /**
     * If this is a {@code blik} PaymentMethod, this hash contains details about the BLIK payment
     * method.
     */
    public Builder setBlik(PaymentMethodCreateParams.Blik blik) {
      this.blik = blik;
      return this;
    }

    /**
     * If this is a {@code boleto} PaymentMethod, this hash contains details about the Boleto
     * payment method.
     */
    public Builder setBoleto(PaymentMethodCreateParams.Boleto boleto) {
      this.boleto = boleto;
      return this;
    }

    /**
     * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
     * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
     * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card:
     * {token: "tok_visa"}}. When providing a card number, you must meet the requirements for <a
     * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
     * strongly recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(PaymentMethodCreateParams.CardDetails card) {
      this.card = card;
      return this;
    }

    /**
     * If this is a {@code card} PaymentMethod, this hash contains the user's card details. For
     * backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
     * Amex Express Checkout, or legacy Checkout) into the card hash with format {@code card:
     * {token: "tok_visa"}}. When providing a card number, you must meet the requirements for <a
     * href="https://stripe.com/docs/security#validating-pci-compliance">PCI compliance</a>. We
     * strongly recommend using Stripe.js instead of interacting with this API directly.
     */
    public Builder setCard(PaymentMethodCreateParams.Token card) {
      this.card = card;
      return this;
    }

    /** The {@code Customer} to whom the original PaymentMethod is attached. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * If this is a {@code customer_balance} PaymentMethod, this hash contains details about the
     * CustomerBalance payment method.
     */
    public Builder setCustomerBalance(PaymentMethodCreateParams.CustomerBalance customerBalance) {
      this.customerBalance = customerBalance;
      return this;
    }

    /**
     * If this is an {@code eps} PaymentMethod, this hash contains details about the EPS payment
     * method.
     */
    public Builder setEps(PaymentMethodCreateParams.Eps eps) {
      this.eps = eps;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * PaymentMethodCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * If this is an {@code fpx} PaymentMethod, this hash contains details about the FPX payment
     * method.
     */
    public Builder setFpx(PaymentMethodCreateParams.Fpx fpx) {
      this.fpx = fpx;
      return this;
    }

    /**
     * If this is a {@code giropay} PaymentMethod, this hash contains details about the Giropay
     * payment method.
     */
    public Builder setGiropay(PaymentMethodCreateParams.Giropay giropay) {
      this.giropay = giropay;
      return this;
    }

    /**
     * If this is a {@code grabpay} PaymentMethod, this hash contains details about the GrabPay
     * payment method.
     */
    public Builder setGrabpay(PaymentMethodCreateParams.Grabpay grabpay) {
      this.grabpay = grabpay;
      return this;
    }

    /**
     * If this is an {@code ideal} PaymentMethod, this hash contains details about the iDEAL payment
     * method.
     */
    public Builder setIdeal(PaymentMethodCreateParams.Ideal ideal) {
      this.ideal = ideal;
      return this;
    }

    /**
     * If this is an {@code interac_present} PaymentMethod, this hash contains details about the
     * Interac Present payment method.
     */
    public Builder setInteracPresent(PaymentMethodCreateParams.InteracPresent interacPresent) {
      this.interacPresent = interacPresent;
      return this;
    }

    /**
     * If this is a {@code klarna} PaymentMethod, this hash contains details about the Klarna
     * payment method.
     */
    public Builder setKlarna(PaymentMethodCreateParams.Klarna klarna) {
      this.klarna = klarna;
      return this;
    }

    /**
     * If this is a {@code konbini} PaymentMethod, this hash contains details about the Konbini
     * payment method.
     */
    public Builder setKonbini(PaymentMethodCreateParams.Konbini konbini) {
      this.konbini = konbini;
      return this;
    }

    /**
     * If this is an {@code Link} PaymentMethod, this hash contains details about the Link payment
     * method.
     */
    public Builder setLink(PaymentMethodCreateParams.Link link) {
      this.link = link;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link PaymentMethodCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * If this is an {@code oxxo} PaymentMethod, this hash contains details about the OXXO payment
     * method.
     */
    public Builder setOxxo(PaymentMethodCreateParams.Oxxo oxxo) {
      this.oxxo = oxxo;
      return this;
    }

    /**
     * If this is a {@code p24} PaymentMethod, this hash contains details about the P24 payment
     * method.
     */
    public Builder setP24(PaymentMethodCreateParams.P24 p24) {
      this.p24 = p24;
      return this;
    }

    /** The PaymentMethod to share. */
    public Builder setPaymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * If this is a {@code paynow} PaymentMethod, this hash contains details about the PayNow
     * payment method.
     */
    public Builder setPaynow(PaymentMethodCreateParams.Paynow paynow) {
      this.paynow = paynow;
      return this;
    }

    /**
     * If this is a {@code pix} PaymentMethod, this hash contains details about the Pix payment
     * method.
     */
    public Builder setPix(PaymentMethodCreateParams.Pix pix) {
      this.pix = pix;
      return this;
    }

    /**
     * If this is a {@code promptpay} PaymentMethod, this hash contains details about the PromptPay
     * payment method.
     */
    public Builder setPromptpay(PaymentMethodCreateParams.Promptpay promptpay) {
      this.promptpay = promptpay;
      return this;
    }

    /**
     * Options to configure Radar. See <a href="https://stripe.com/docs/radar/radar-session">Radar
     * Session</a> for more information.
     */
    public Builder setRadarOptions(PaymentMethodCreateParams.RadarOptions radarOptions) {
      this.radarOptions = radarOptions;
      return this;
    }

    /**
     * If this is a {@code sepa_debit} PaymentMethod, this hash contains details about the SEPA
     * debit bank account.
     */
    public Builder setSepaDebit(PaymentMethodCreateParams.SepaDebit sepaDebit) {
      this.sepaDebit = sepaDebit;
      return this;
    }

    /**
     * If this is a {@code sofort} PaymentMethod, this hash contains details about the SOFORT
     * payment method.
     */
    public Builder setSofort(PaymentMethodCreateParams.Sofort sofort) {
      this.sofort = sofort;
      return this;
    }

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a
     * name matching this value. It contains additional information specific to the PaymentMethod
     * type.
     */
    public Builder setType(PaymentMethodCreateParams.Type type) {
      this.type = type;
      return this;
    }

    /**
     * If this is an {@code us_bank_account} PaymentMethod, this hash contains details about the US
     * bank account payment method.
     */
    public Builder setUsBankAccount(PaymentMethodCreateParams.UsBankAccount usBankAccount) {
      this.usBankAccount = usBankAccount;
      return this;
    }

    /**
     * If this is an {@code wechat_pay} PaymentMethod, this hash contains details about the
     * wechat_pay payment method.
     */
    public Builder setWechatPay(PaymentMethodCreateParams.WechatPay wechatPay) {
      this.wechatPay = wechatPay;
      return this;
    }
  }

  @Getter
  public static class AcssDebit {
    /** Customer's bank account number. */
    @SerializedName("account_number")
    String accountNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Institution number of the customer's bank. */
    @SerializedName("institution_number")
    String institutionNumber;

    /** Transit number of the customer's bank. */
    @SerializedName("transit_number")
    String transitNumber;

    private AcssDebit(
        String accountNumber,
        Map<String, Object> extraParams,
        String institutionNumber,
        String transitNumber) {
      this.accountNumber = accountNumber;
      this.extraParams = extraParams;
      this.institutionNumber = institutionNumber;
      this.transitNumber = transitNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountNumber;

      private Map<String, Object> extraParams;

      private String institutionNumber;

      private String transitNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.AcssDebit build() {
        return new PaymentMethodCreateParams.AcssDebit(
            this.accountNumber, this.extraParams, this.institutionNumber, this.transitNumber);
      }

      /** Customer's bank account number. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.AcssDebit#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.AcssDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Institution number of the customer's bank. */
      public Builder setInstitutionNumber(String institutionNumber) {
        this.institutionNumber = institutionNumber;
        return this;
      }

      /** Transit number of the customer's bank. */
      public Builder setTransitNumber(String transitNumber) {
        this.transitNumber = transitNumber;
        return this;
      }
    }
  }

  @Getter
  public static class Affirm {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Affirm(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Affirm build() {
        return new PaymentMethodCreateParams.Affirm(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Affirm#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Affirm#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class AfterpayClearpay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AfterpayClearpay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.AfterpayClearpay build() {
        return new PaymentMethodCreateParams.AfterpayClearpay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.AfterpayClearpay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.AfterpayClearpay#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Alipay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Alipay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Alipay build() {
        return new PaymentMethodCreateParams.Alipay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Alipay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Alipay#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class AuBecsDebit {
    /** The account number for the bank account. */
    @SerializedName("account_number")
    String accountNumber;

    /** Bank-State-Branch number of the bank account. */
    @SerializedName("bsb_number")
    String bsbNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private AuBecsDebit(String accountNumber, String bsbNumber, Map<String, Object> extraParams) {
      this.accountNumber = accountNumber;
      this.bsbNumber = bsbNumber;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountNumber;

      private String bsbNumber;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.AuBecsDebit build() {
        return new PaymentMethodCreateParams.AuBecsDebit(
            this.accountNumber, this.bsbNumber, this.extraParams);
      }

      /** The account number for the bank account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** Bank-State-Branch number of the bank account. */
      public Builder setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.AuBecsDebit#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.AuBecsDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class BacsDebit {
    /** Account number of the bank account that the funds will be debited from. */
    @SerializedName("account_number")
    String accountNumber;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
    @SerializedName("sort_code")
    String sortCode;

    private BacsDebit(String accountNumber, Map<String, Object> extraParams, String sortCode) {
      this.accountNumber = accountNumber;
      this.extraParams = extraParams;
      this.sortCode = sortCode;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String accountNumber;

      private Map<String, Object> extraParams;

      private String sortCode;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.BacsDebit build() {
        return new PaymentMethodCreateParams.BacsDebit(
            this.accountNumber, this.extraParams, this.sortCode);
      }

      /** Account number of the bank account that the funds will be debited from. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BacsDebit#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.BacsDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Sort code of the bank account. (e.g., {@code 10-20-30}) */
      public Builder setSortCode(String sortCode) {
        this.sortCode = sortCode;
        return this;
      }
    }
  }

  @Getter
  public static class Bancontact {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Bancontact(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Bancontact build() {
        return new PaymentMethodCreateParams.Bancontact(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Bancontact#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Bancontact#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class BillingDetails {
    /** Billing address. */
    @SerializedName("address")
    Object address;

    /** Email address. */
    @SerializedName("email")
    Object email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Full name. */
    @SerializedName("name")
    String name;

    /** Billing phone number (including extension). */
    @SerializedName("phone")
    String phone;

    private BillingDetails(
        Object address, Object email, Map<String, Object> extraParams, String name, String phone) {
      this.address = address;
      this.email = email;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Object address;

      private Object email;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.BillingDetails build() {
        return new PaymentMethodCreateParams.BillingDetails(
            this.address, this.email, this.extraParams, this.name, this.phone);
      }

      /** Billing address. */
      public Builder setAddress(PaymentMethodCreateParams.BillingDetails.Address address) {
        this.address = address;
        return this;
      }

      /** Billing address. */
      public Builder setAddress(EmptyParam address) {
        this.address = address;
        return this;
      }

      /** Email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /** Email address. */
      public Builder setEmail(EmptyParam email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.BillingDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.BillingDetails#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Full name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Billing phone number (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }
    }

    @Getter
    public static class Address {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /** State, county, province, or region. */
      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodCreateParams.BillingDetails.Address build() {
          return new PaymentMethodCreateParams.BillingDetails.Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        /** City, district, suburb, town, or village. */
        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        /**
         * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
         * 3166-1 alpha-2</a>).
         */
        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.BillingDetails.Address#extraParams} for the
         * field documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** Address line 1 (e.g., street, PO Box, or company name). */
        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        /** Address line 2 (e.g., apartment, suite, unit, or building). */
        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        /** ZIP or postal code. */
        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        /** State, county, province, or region. */
        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class Blik {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Blik(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Blik build() {
        return new PaymentMethodCreateParams.Blik(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Blik#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Blik#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Boleto {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The tax ID of the customer (CPF for individual consumers or CNPJ for businesses consumers).
     */
    @SerializedName("tax_id")
    String taxId;

    private Boleto(Map<String, Object> extraParams, String taxId) {
      this.extraParams = extraParams;
      this.taxId = taxId;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String taxId;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Boleto build() {
        return new PaymentMethodCreateParams.Boleto(this.extraParams, this.taxId);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Boleto#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Boleto#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * The tax ID of the customer (CPF for individual consumers or CNPJ for businesses consumers).
       */
      public Builder setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
      }
    }
  }

  @Getter
  public static class CardDetails {
    /** The card's CVC. It is highly recommended to always include this value. */
    @SerializedName("cvc")
    String cvc;

    /** Two-digit number representing the card's expiration month. */
    @SerializedName("exp_month")
    Long expMonth;

    /** Four-digit number representing the card's expiration year. */
    @SerializedName("exp_year")
    Long expYear;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The card number, as a string without any separators. */
    @SerializedName("number")
    String number;

    private CardDetails(
        String cvc, Long expMonth, Long expYear, Map<String, Object> extraParams, String number) {
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.extraParams = extraParams;
      this.number = number;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String cvc;

      private Long expMonth;

      private Long expYear;

      private Map<String, Object> extraParams;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.CardDetails build() {
        return new PaymentMethodCreateParams.CardDetails(
            this.cvc, this.expMonth, this.expYear, this.extraParams, this.number);
      }

      /** The card's CVC. It is highly recommended to always include this value. */
      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      /** Two-digit number representing the card's expiration month. */
      public Builder setExpMonth(Long expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      /** Four-digit number representing the card's expiration year. */
      public Builder setExpYear(Long expYear) {
        this.expYear = expYear;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.CardDetails#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The card number, as a string without any separators. */
      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  @Getter
  public static class CustomerBalance {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CustomerBalance(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.CustomerBalance build() {
        return new PaymentMethodCreateParams.CustomerBalance(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.CustomerBalance#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.CustomerBalance#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Eps {
    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Eps(Bank bank, Map<String, Object> extraParams) {
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Eps build() {
        return new PaymentMethodCreateParams.Eps(this.bank, this.extraParams);
      }

      /** The customer's bank. */
      public Builder setBank(PaymentMethodCreateParams.Eps.Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Eps#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Eps#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("arzte_und_apotheker_bank")
      ARZTE_UND_APOTHEKER_BANK("arzte_und_apotheker_bank"),

      @SerializedName("austrian_anadi_bank_ag")
      AUSTRIAN_ANADI_BANK_AG("austrian_anadi_bank_ag"),

      @SerializedName("bank_austria")
      BANK_AUSTRIA("bank_austria"),

      @SerializedName("bankhaus_carl_spangler")
      BANKHAUS_CARL_SPANGLER("bankhaus_carl_spangler"),

      @SerializedName("bankhaus_schelhammer_und_schattera_ag")
      BANKHAUS_SCHELHAMMER_UND_SCHATTERA_AG("bankhaus_schelhammer_und_schattera_ag"),

      @SerializedName("bawag_psk_ag")
      BAWAG_PSK_AG("bawag_psk_ag"),

      @SerializedName("bks_bank_ag")
      BKS_BANK_AG("bks_bank_ag"),

      @SerializedName("brull_kallmus_bank_ag")
      BRULL_KALLMUS_BANK_AG("brull_kallmus_bank_ag"),

      @SerializedName("btv_vier_lander_bank")
      BTV_VIER_LANDER_BANK("btv_vier_lander_bank"),

      @SerializedName("capital_bank_grawe_gruppe_ag")
      CAPITAL_BANK_GRAWE_GRUPPE_AG("capital_bank_grawe_gruppe_ag"),

      @SerializedName("deutsche_bank_ag")
      DEUTSCHE_BANK_AG("deutsche_bank_ag"),

      @SerializedName("dolomitenbank")
      DOLOMITENBANK("dolomitenbank"),

      @SerializedName("easybank_ag")
      EASYBANK_AG("easybank_ag"),

      @SerializedName("erste_bank_und_sparkassen")
      ERSTE_BANK_UND_SPARKASSEN("erste_bank_und_sparkassen"),

      @SerializedName("hypo_alpeadriabank_international_ag")
      HYPO_ALPEADRIABANK_INTERNATIONAL_AG("hypo_alpeadriabank_international_ag"),

      @SerializedName("hypo_bank_burgenland_aktiengesellschaft")
      HYPO_BANK_BURGENLAND_AKTIENGESELLSCHAFT("hypo_bank_burgenland_aktiengesellschaft"),

      @SerializedName("hypo_noe_lb_fur_niederosterreich_u_wien")
      HYPO_NOE_LB_FUR_NIEDEROSTERREICH_U_WIEN("hypo_noe_lb_fur_niederosterreich_u_wien"),

      @SerializedName("hypo_oberosterreich_salzburg_steiermark")
      HYPO_OBEROSTERREICH_SALZBURG_STEIERMARK("hypo_oberosterreich_salzburg_steiermark"),

      @SerializedName("hypo_tirol_bank_ag")
      HYPO_TIROL_BANK_AG("hypo_tirol_bank_ag"),

      @SerializedName("hypo_vorarlberg_bank_ag")
      HYPO_VORARLBERG_BANK_AG("hypo_vorarlberg_bank_ag"),

      @SerializedName("marchfelder_bank")
      MARCHFELDER_BANK("marchfelder_bank"),

      @SerializedName("oberbank_ag")
      OBERBANK_AG("oberbank_ag"),

      @SerializedName("raiffeisen_bankengruppe_osterreich")
      RAIFFEISEN_BANKENGRUPPE_OSTERREICH("raiffeisen_bankengruppe_osterreich"),

      @SerializedName("schoellerbank_ag")
      SCHOELLERBANK_AG("schoellerbank_ag"),

      @SerializedName("sparda_bank_wien")
      SPARDA_BANK_WIEN("sparda_bank_wien"),

      @SerializedName("volksbank_gruppe")
      VOLKSBANK_GRUPPE("volksbank_gruppe"),

      @SerializedName("volkskreditbank_ag")
      VOLKSKREDITBANK_AG("volkskreditbank_ag"),

      @SerializedName("vr_bank_braunau")
      VR_BANK_BRAUNAU("vr_bank_braunau");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Fpx {
    /** Account holder type for FPX transaction. */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Fpx(AccountHolderType accountHolderType, Bank bank, Map<String, Object> extraParams) {
      this.accountHolderType = accountHolderType;
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountHolderType accountHolderType;

      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Fpx build() {
        return new PaymentMethodCreateParams.Fpx(
            this.accountHolderType, this.bank, this.extraParams);
      }

      /** Account holder type for FPX transaction. */
      public Builder setAccountHolderType(
          PaymentMethodCreateParams.Fpx.AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** The customer's bank. */
      public Builder setBank(PaymentMethodCreateParams.Fpx.Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Fpx#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Fpx#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("affin_bank")
      AFFIN_BANK("affin_bank"),

      @SerializedName("agrobank")
      AGROBANK("agrobank"),

      @SerializedName("alliance_bank")
      ALLIANCE_BANK("alliance_bank"),

      @SerializedName("ambank")
      AMBANK("ambank"),

      @SerializedName("bank_islam")
      BANK_ISLAM("bank_islam"),

      @SerializedName("bank_muamalat")
      BANK_MUAMALAT("bank_muamalat"),

      @SerializedName("bank_of_china")
      BANK_OF_CHINA("bank_of_china"),

      @SerializedName("bank_rakyat")
      BANK_RAKYAT("bank_rakyat"),

      @SerializedName("bsn")
      BSN("bsn"),

      @SerializedName("cimb")
      CIMB("cimb"),

      @SerializedName("deutsche_bank")
      DEUTSCHE_BANK("deutsche_bank"),

      @SerializedName("hong_leong_bank")
      HONG_LEONG_BANK("hong_leong_bank"),

      @SerializedName("hsbc")
      HSBC("hsbc"),

      @SerializedName("kfh")
      KFH("kfh"),

      @SerializedName("maybank2e")
      MAYBANK2E("maybank2e"),

      @SerializedName("maybank2u")
      MAYBANK2U("maybank2u"),

      @SerializedName("ocbc")
      OCBC("ocbc"),

      @SerializedName("pb_enterprise")
      PB_ENTERPRISE("pb_enterprise"),

      @SerializedName("public_bank")
      PUBLIC_BANK("public_bank"),

      @SerializedName("rhb")
      RHB("rhb"),

      @SerializedName("standard_chartered")
      STANDARD_CHARTERED("standard_chartered"),

      @SerializedName("uob")
      UOB("uob");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Giropay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Giropay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Giropay build() {
        return new PaymentMethodCreateParams.Giropay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Giropay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Giropay#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Grabpay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Grabpay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Grabpay build() {
        return new PaymentMethodCreateParams.Grabpay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Grabpay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Grabpay#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Ideal {
    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Ideal(Bank bank, Map<String, Object> extraParams) {
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Ideal build() {
        return new PaymentMethodCreateParams.Ideal(this.bank, this.extraParams);
      }

      /** The customer's bank. */
      public Builder setBank(PaymentMethodCreateParams.Ideal.Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Ideal#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Ideal#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("abn_amro")
      ABN_AMRO("abn_amro"),

      @SerializedName("asn_bank")
      ASN_BANK("asn_bank"),

      @SerializedName("bunq")
      BUNQ("bunq"),

      @SerializedName("handelsbanken")
      HANDELSBANKEN("handelsbanken"),

      @SerializedName("ing")
      ING("ing"),

      @SerializedName("knab")
      KNAB("knab"),

      @SerializedName("moneyou")
      MONEYOU("moneyou"),

      @SerializedName("rabobank")
      RABOBANK("rabobank"),

      @SerializedName("regiobank")
      REGIOBANK("regiobank"),

      @SerializedName("revolut")
      REVOLUT("revolut"),

      @SerializedName("sns_bank")
      SNS_BANK("sns_bank"),

      @SerializedName("triodos_bank")
      TRIODOS_BANK("triodos_bank"),

      @SerializedName("van_lanschot")
      VAN_LANSCHOT("van_lanschot"),

      @SerializedName("yoursafe")
      YOURSAFE("yoursafe");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class InteracPresent {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private InteracPresent(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.InteracPresent build() {
        return new PaymentMethodCreateParams.InteracPresent(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.InteracPresent#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.InteracPresent#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Klarna {
    /** Customer's date of birth. */
    @SerializedName("dob")
    Dob dob;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Klarna(Dob dob, Map<String, Object> extraParams) {
      this.dob = dob;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Dob dob;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Klarna build() {
        return new PaymentMethodCreateParams.Klarna(this.dob, this.extraParams);
      }

      /** Customer's date of birth. */
      public Builder setDob(PaymentMethodCreateParams.Klarna.Dob dob) {
        this.dob = dob;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Klarna#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Klarna#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    @Getter
    public static class Dob {
      /** The day of birth, between 1 and 31. */
      @SerializedName("day")
      Long day;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      /** The month of birth, between 1 and 12. */
      @SerializedName("month")
      Long month;

      /** The four-digit year of birth. */
      @SerializedName("year")
      Long year;

      private Dob(Long day, Map<String, Object> extraParams, Long month, Long year) {
        this.day = day;
        this.extraParams = extraParams;
        this.month = month;
        this.year = year;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private Long day;

        private Map<String, Object> extraParams;

        private Long month;

        private Long year;

        /** Finalize and obtain parameter instance from this builder. */
        public PaymentMethodCreateParams.Klarna.Dob build() {
          return new PaymentMethodCreateParams.Klarna.Dob(
              this.day, this.extraParams, this.month, this.year);
        }

        /** The day of birth, between 1 and 31. */
        public Builder setDay(Long day) {
          this.day = day;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.Klarna.Dob#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link PaymentMethodCreateParams.Klarna.Dob#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        /** The month of birth, between 1 and 12. */
        public Builder setMonth(Long month) {
          this.month = month;
          return this;
        }

        /** The four-digit year of birth. */
        public Builder setYear(Long year) {
          this.year = year;
          return this;
        }
      }
    }
  }

  @Getter
  public static class Konbini {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Konbini(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Konbini build() {
        return new PaymentMethodCreateParams.Konbini(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Konbini#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Konbini#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Link {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Link(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Link build() {
        return new PaymentMethodCreateParams.Link(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Link#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Link#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Oxxo {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Oxxo(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Oxxo build() {
        return new PaymentMethodCreateParams.Oxxo(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Oxxo#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Oxxo#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class P24 {
    /** The customer's bank. */
    @SerializedName("bank")
    Bank bank;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private P24(Bank bank, Map<String, Object> extraParams) {
      this.bank = bank;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Bank bank;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.P24 build() {
        return new PaymentMethodCreateParams.P24(this.bank, this.extraParams);
      }

      /** The customer's bank. */
      public Builder setBank(PaymentMethodCreateParams.P24.Bank bank) {
        this.bank = bank;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.P24#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.P24#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Bank implements ApiRequestParams.EnumParam {
      @SerializedName("alior_bank")
      ALIOR_BANK("alior_bank"),

      @SerializedName("bank_millennium")
      BANK_MILLENNIUM("bank_millennium"),

      @SerializedName("bank_nowy_bfg_sa")
      BANK_NOWY_BFG_SA("bank_nowy_bfg_sa"),

      @SerializedName("bank_pekao_sa")
      BANK_PEKAO_SA("bank_pekao_sa"),

      @SerializedName("banki_spbdzielcze")
      BANKI_SPBDZIELCZE("banki_spbdzielcze"),

      @SerializedName("blik")
      BLIK("blik"),

      @SerializedName("bnp_paribas")
      BNP_PARIBAS("bnp_paribas"),

      @SerializedName("boz")
      BOZ("boz"),

      @SerializedName("citi_handlowy")
      CITI_HANDLOWY("citi_handlowy"),

      @SerializedName("credit_agricole")
      CREDIT_AGRICOLE("credit_agricole"),

      @SerializedName("envelobank")
      ENVELOBANK("envelobank"),

      @SerializedName("etransfer_pocztowy24")
      ETRANSFER_POCZTOWY24("etransfer_pocztowy24"),

      @SerializedName("getin_bank")
      GETIN_BANK("getin_bank"),

      @SerializedName("ideabank")
      IDEABANK("ideabank"),

      @SerializedName("ing")
      ING("ing"),

      @SerializedName("inteligo")
      INTELIGO("inteligo"),

      @SerializedName("mbank_mtransfer")
      MBANK_MTRANSFER("mbank_mtransfer"),

      @SerializedName("nest_przelew")
      NEST_PRZELEW("nest_przelew"),

      @SerializedName("noble_pay")
      NOBLE_PAY("noble_pay"),

      @SerializedName("pbac_z_ipko")
      PBAC_Z_IPKO("pbac_z_ipko"),

      @SerializedName("plus_bank")
      PLUS_BANK("plus_bank"),

      @SerializedName("santander_przelew24")
      SANTANDER_PRZELEW24("santander_przelew24"),

      @SerializedName("tmobile_usbugi_bankowe")
      TMOBILE_USBUGI_BANKOWE("tmobile_usbugi_bankowe"),

      @SerializedName("toyota_bank")
      TOYOTA_BANK("toyota_bank"),

      @SerializedName("volkswagen_bank")
      VOLKSWAGEN_BANK("volkswagen_bank");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Bank(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Paynow {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Paynow(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Paynow build() {
        return new PaymentMethodCreateParams.Paynow(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Paynow#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Paynow#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Pix {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Pix(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Pix build() {
        return new PaymentMethodCreateParams.Pix(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Pix#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Pix#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Promptpay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Promptpay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Promptpay build() {
        return new PaymentMethodCreateParams.Promptpay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Promptpay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Promptpay#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class RadarOptions {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
     * the browser metadata and device details that help Radar make more accurate predictions on
     * your payments.
     */
    @SerializedName("session")
    String session;

    private RadarOptions(Map<String, Object> extraParams, String session) {
      this.extraParams = extraParams;
      this.session = session;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String session;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.RadarOptions build() {
        return new PaymentMethodCreateParams.RadarOptions(this.extraParams, this.session);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.RadarOptions#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.RadarOptions#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * A <a href="https://stripe.com/docs/radar/radar-session">Radar Session</a> is a snapshot of
       * the browser metadata and device details that help Radar make more accurate predictions on
       * your payments.
       */
      public Builder setSession(String session) {
        this.session = session;
        return this;
      }
    }
  }

  @Getter
  public static class SepaDebit {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** IBAN of the bank account. */
    @SerializedName("iban")
    String iban;

    private SepaDebit(Map<String, Object> extraParams, String iban) {
      this.extraParams = extraParams;
      this.iban = iban;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String iban;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.SepaDebit build() {
        return new PaymentMethodCreateParams.SepaDebit(this.extraParams, this.iban);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.SepaDebit#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.SepaDebit#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** IBAN of the bank account. */
      public Builder setIban(String iban) {
        this.iban = iban;
        return this;
      }
    }
  }

  @Getter
  public static class Sofort {
    /** Two-letter ISO code representing the country the bank account is located in. */
    @SerializedName("country")
    Country country;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Sofort(Country country, Map<String, Object> extraParams) {
      this.country = country;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Country country;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Sofort build() {
        return new PaymentMethodCreateParams.Sofort(this.country, this.extraParams);
      }

      /** Two-letter ISO code representing the country the bank account is located in. */
      public Builder setCountry(PaymentMethodCreateParams.Sofort.Country country) {
        this.country = country;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Sofort#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Sofort#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }

    public enum Country implements ApiRequestParams.EnumParam {
      @SerializedName("AT")
      AT("AT"),

      @SerializedName("BE")
      BE("BE"),

      @SerializedName("DE")
      DE("DE"),

      @SerializedName("ES")
      ES("ES"),

      @SerializedName("IT")
      IT("IT"),

      @SerializedName("NL")
      NL("NL");

      @Getter(onMethod_ = {@Override})
      private final String value;

      Country(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class Token {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("token")
    String token;

    private Token(Map<String, Object> extraParams, String token) {
      this.extraParams = extraParams;
      this.token = token;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      private String token;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.Token build() {
        return new PaymentMethodCreateParams.Token(this.extraParams, this.token);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.Token#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      public Builder setToken(String token) {
        this.token = token;
        return this;
      }
    }
  }

  @Getter
  public static class UsBankAccount {
    /** Account holder type: individual or company. */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** Account number of the bank account. */
    @SerializedName("account_number")
    String accountNumber;

    /** Account type: checkings or savings. Defaults to checking if omitted. */
    @SerializedName("account_type")
    AccountType accountType;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** The ID of a Financial Connections Account to use as a payment method. */
    @SerializedName("financial_connections_account")
    String financialConnectionsAccount;

    /** Routing number of the bank account. */
    @SerializedName("routing_number")
    String routingNumber;

    private UsBankAccount(
        AccountHolderType accountHolderType,
        String accountNumber,
        AccountType accountType,
        Map<String, Object> extraParams,
        String financialConnectionsAccount,
        String routingNumber) {
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
      this.accountType = accountType;
      this.extraParams = extraParams;
      this.financialConnectionsAccount = financialConnectionsAccount;
      this.routingNumber = routingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private AccountHolderType accountHolderType;

      private String accountNumber;

      private AccountType accountType;

      private Map<String, Object> extraParams;

      private String financialConnectionsAccount;

      private String routingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.UsBankAccount build() {
        return new PaymentMethodCreateParams.UsBankAccount(
            this.accountHolderType,
            this.accountNumber,
            this.accountType,
            this.extraParams,
            this.financialConnectionsAccount,
            this.routingNumber);
      }

      /** Account holder type: individual or company. */
      public Builder setAccountHolderType(
          PaymentMethodCreateParams.UsBankAccount.AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** Account number of the bank account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** Account type: checkings or savings. Defaults to checking if omitted. */
      public Builder setAccountType(
          PaymentMethodCreateParams.UsBankAccount.AccountType accountType) {
        this.accountType = accountType;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.UsBankAccount#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.UsBankAccount#extraParams} for the field
       * documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** The ID of a Financial Connections Account to use as a payment method. */
      public Builder setFinancialConnectionsAccount(String financialConnectionsAccount) {
        this.financialConnectionsAccount = financialConnectionsAccount;
        return this;
      }

      /** Routing number of the bank account. */
      public Builder setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }

    public enum AccountType implements ApiRequestParams.EnumParam {
      @SerializedName("checking")
      CHECKING("checking"),

      @SerializedName("savings")
      SAVINGS("savings");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountType(String value) {
        this.value = value;
      }
    }
  }

  @Getter
  public static class WechatPay {
    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private WechatPay(Map<String, Object> extraParams) {
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public PaymentMethodCreateParams.WechatPay build() {
        return new PaymentMethodCreateParams.WechatPay(this.extraParams);
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * PaymentMethodCreateParams.WechatPay#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link PaymentMethodCreateParams.WechatPay#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  public enum Type implements ApiRequestParams.EnumParam {
    @SerializedName("acss_debit")
    ACSS_DEBIT("acss_debit"),

    @SerializedName("affirm")
    AFFIRM("affirm"),

    @SerializedName("afterpay_clearpay")
    AFTERPAY_CLEARPAY("afterpay_clearpay"),

    @SerializedName("alipay")
    ALIPAY("alipay"),

    @SerializedName("au_becs_debit")
    AU_BECS_DEBIT("au_becs_debit"),

    @SerializedName("bacs_debit")
    BACS_DEBIT("bacs_debit"),

    @SerializedName("bancontact")
    BANCONTACT("bancontact"),

    @SerializedName("blik")
    BLIK("blik"),

    @SerializedName("boleto")
    BOLETO("boleto"),

    @SerializedName("card")
    CARD("card"),

    @SerializedName("customer_balance")
    CUSTOMER_BALANCE("customer_balance"),

    @SerializedName("eps")
    EPS("eps"),

    @SerializedName("fpx")
    FPX("fpx"),

    @SerializedName("giropay")
    GIROPAY("giropay"),

    @SerializedName("grabpay")
    GRABPAY("grabpay"),

    @SerializedName("ideal")
    IDEAL("ideal"),

    @SerializedName("klarna")
    KLARNA("klarna"),

    @SerializedName("konbini")
    KONBINI("konbini"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("oxxo")
    OXXO("oxxo"),

    @SerializedName("p24")
    P24("p24"),

    @SerializedName("paynow")
    PAYNOW("paynow"),

    @SerializedName("pix")
    PIX("pix"),

    @SerializedName("promptpay")
    PROMPTPAY("promptpay"),

    @SerializedName("sepa_debit")
    SEPA_DEBIT("sepa_debit"),

    @SerializedName("sofort")
    SOFORT("sofort"),

    @SerializedName("us_bank_account")
    US_BANK_ACCOUNT("us_bank_account"),

    @SerializedName("wechat_pay")
    WECHAT_PAY("wechat_pay");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Type(String value) {
      this.value = value;
    }
  }
}
