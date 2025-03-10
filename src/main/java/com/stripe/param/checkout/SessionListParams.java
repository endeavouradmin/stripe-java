// File generated from our OpenAPI spec
package com.stripe.param.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SessionListParams extends ApiRequestParams {
  /** Only return the Checkout Sessions for the Customer specified. */
  @SerializedName("customer")
  String customer;

  /** Only return the Checkout Sessions for the Customer details specified. */
  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

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
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only return the Checkout Session for the PaymentIntent specified. */
  @SerializedName("payment_intent")
  String paymentIntent;

  /** Only return the Checkout Sessions for the Payment Link specified. */
  @SerializedName("payment_link")
  String paymentLink;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return the Checkout Session for the subscription specified. */
  @SerializedName("subscription")
  String subscription;

  private SessionListParams(
      String customer,
      CustomerDetails customerDetails,
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      String paymentIntent,
      String paymentLink,
      String startingAfter,
      String subscription) {
    this.customer = customer;
    this.customerDetails = customerDetails;
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.paymentIntent = paymentIntent;
    this.paymentLink = paymentLink;
    this.startingAfter = startingAfter;
    this.subscription = subscription;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private CustomerDetails customerDetails;

    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private String paymentIntent;

    private String paymentLink;

    private String startingAfter;

    private String subscription;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionListParams build() {
      return new SessionListParams(
          this.customer,
          this.customerDetails,
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.paymentIntent,
          this.paymentLink,
          this.startingAfter,
          this.subscription);
    }

    /** Only return the Checkout Sessions for the Customer specified. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /** Only return the Checkout Sessions for the Customer details specified. */
    public Builder setCustomerDetails(SessionListParams.CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionListParams#expand} for the field documentation.
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
     * SessionListParams#expand} for the field documentation.
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
     * SessionListParams#extraParams} for the field documentation.
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
     * See {@link SessionListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /** Only return the Checkout Session for the PaymentIntent specified. */
    public Builder setPaymentIntent(String paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /** Only return the Checkout Sessions for the Payment Link specified. */
    public Builder setPaymentLink(String paymentLink) {
      this.paymentLink = paymentLink;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /** Only return the Checkout Session for the subscription specified. */
    public Builder setSubscription(String subscription) {
      this.subscription = subscription;
      return this;
    }
  }

  @Getter
  public static class CustomerDetails {
    /** Customer's email address. */
    @SerializedName("email")
    String email;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private CustomerDetails(String email, Map<String, Object> extraParams) {
      this.email = email;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String email;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public SessionListParams.CustomerDetails build() {
        return new SessionListParams.CustomerDetails(this.email, this.extraParams);
      }

      /** Customer's email address. */
      public Builder setEmail(String email) {
        this.email = email;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * SessionListParams.CustomerDetails#extraParams} for the field documentation.
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
       * See {@link SessionListParams.CustomerDetails#extraParams} for the field documentation.
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
}
