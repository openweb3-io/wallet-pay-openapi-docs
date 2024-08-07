/*
 * Pay API Documentations
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"time"
)

// InvoiceOut struct for InvoiceOut
type InvoiceOut struct {
	// The invoice's ID
	Id string `json:"id"`
	// The invoice's UID
	Uid NullableString `json:"uid,omitempty"`
	// The invoice's creator
	UserId NullableString `json:"userId,omitempty"`
	// Invoice channel
	Channel string `json:"channel"`
	// Currency code
	Currency string `json:"currency"`
	// Big decimal string representation. Note that the max precision (number of digits after decimal point) depends on the currencyCode. E.g. for all fiat currencies is 2 (0.01), for BTC is 8, for USDT is 6. There's also min invoice amount for creating an invoice. It's 0.000001 BTC / 0.01 USDT / 0.01 USD / 0.01 EUR / 0.1 RUB.
	Amount string `json:"amount"`
	// Optional credentials
	Credentials map[string]interface{} `json:"credentials,omitempty"`
	// Optional metadata
	Metadata map[string]interface{} `json:"metadata"`
	// Optional metadata
	Extra map[string]interface{} `json:"extra,omitempty"`
	// invoice note
	Note *string `json:"note,omitempty"`
	// The expiration seconds
	Expiration *int32 `json:"expiration,omitempty"`
	// The invoice's status
	Status string `json:"status"`
	// The message when invoice failed
	FailedMessage *string `json:"failedMessage,omitempty"`
	// The invoice's creation time
	CreatedAt time.Time `json:"createdAt"`
	// The invoice's paid time
	PaidAt *time.Time `json:"paidAt,omitempty"`
	// The invoice's failure time
	FailedAt NullableTime `json:"failedAt,omitempty"`
	// The invoice's cancel time
	CanceledAt NullableTime `json:"canceledAt,omitempty"`
	// The invoice's expiration time
	ExpiredAt NullableTime `json:"expiredAt,omitempty"`
}

// NewInvoiceOut instantiates a new InvoiceOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInvoiceOut(id string, channel string, currency string, amount string, metadata map[string]interface{}, status string, createdAt time.Time) *InvoiceOut {
	this := InvoiceOut{}
	this.Id = id
	this.Channel = channel
	this.Currency = currency
	this.Amount = amount
	this.Metadata = metadata
	this.Status = status
	this.CreatedAt = createdAt
	return &this
}

// NewInvoiceOutWithDefaults instantiates a new InvoiceOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInvoiceOutWithDefaults() *InvoiceOut {
	this := InvoiceOut{}
	return &this
}

// GetId returns the Id field value
func (o *InvoiceOut) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *InvoiceOut) SetId(v string) {
	o.Id = v
}

// GetUid returns the Uid field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetUid() string {
	if o == nil || o.Uid.Get() == nil {
		var ret string
		return ret
	}
	return *o.Uid.Get()
}

// GetUidOk returns a tuple with the Uid field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetUidOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Uid.Get(), o.Uid.IsSet()
}

// HasUid returns a boolean if a field has been set.
func (o *InvoiceOut) HasUid() bool {
	if o != nil && o.Uid.IsSet() {
		return true
	}

	return false
}

// SetUid gets a reference to the given NullableString and assigns it to the Uid field.
func (o *InvoiceOut) SetUid(v string) {
	o.Uid.Set(&v)
}
// SetUidNil sets the value for Uid to be an explicit nil
func (o *InvoiceOut) SetUidNil() {
	o.Uid.Set(nil)
}

// UnsetUid ensures that no value is present for Uid, not even an explicit nil
func (o *InvoiceOut) UnsetUid() {
	o.Uid.Unset()
}

// GetUserId returns the UserId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetUserId() string {
	if o == nil || o.UserId.Get() == nil {
		var ret string
		return ret
	}
	return *o.UserId.Get()
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetUserIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.UserId.Get(), o.UserId.IsSet()
}

// HasUserId returns a boolean if a field has been set.
func (o *InvoiceOut) HasUserId() bool {
	if o != nil && o.UserId.IsSet() {
		return true
	}

	return false
}

// SetUserId gets a reference to the given NullableString and assigns it to the UserId field.
func (o *InvoiceOut) SetUserId(v string) {
	o.UserId.Set(&v)
}
// SetUserIdNil sets the value for UserId to be an explicit nil
func (o *InvoiceOut) SetUserIdNil() {
	o.UserId.Set(nil)
}

// UnsetUserId ensures that no value is present for UserId, not even an explicit nil
func (o *InvoiceOut) UnsetUserId() {
	o.UserId.Unset()
}

// GetChannel returns the Channel field value
func (o *InvoiceOut) GetChannel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Channel
}

// GetChannelOk returns a tuple with the Channel field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetChannelOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Channel, true
}

// SetChannel sets field value
func (o *InvoiceOut) SetChannel(v string) {
	o.Channel = v
}

// GetCurrency returns the Currency field value
func (o *InvoiceOut) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *InvoiceOut) SetCurrency(v string) {
	o.Currency = v
}

// GetAmount returns the Amount field value
func (o *InvoiceOut) GetAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetAmountOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *InvoiceOut) SetAmount(v string) {
	o.Amount = v
}

// GetCredentials returns the Credentials field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetCredentials() map[string]interface{} {
	if o == nil  {
		var ret map[string]interface{}
		return ret
	}
	return o.Credentials
}

// GetCredentialsOk returns a tuple with the Credentials field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetCredentialsOk() (*map[string]interface{}, bool) {
	if o == nil || o.Credentials == nil {
		return nil, false
	}
	return &o.Credentials, true
}

// HasCredentials returns a boolean if a field has been set.
func (o *InvoiceOut) HasCredentials() bool {
	if o != nil && o.Credentials != nil {
		return true
	}

	return false
}

// SetCredentials gets a reference to the given map[string]interface{} and assigns it to the Credentials field.
func (o *InvoiceOut) SetCredentials(v map[string]interface{}) {
	o.Credentials = v
}

// GetMetadata returns the Metadata field value
// If the value is explicit nil, the zero value for map[string]interface{} will be returned
func (o *InvoiceOut) GetMetadata() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetMetadataOk() (*map[string]interface{}, bool) {
	if o == nil || o.Metadata == nil {
		return nil, false
	}
	return &o.Metadata, true
}

// SetMetadata sets field value
func (o *InvoiceOut) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

// GetExtra returns the Extra field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetExtra() map[string]interface{} {
	if o == nil  {
		var ret map[string]interface{}
		return ret
	}
	return o.Extra
}

// GetExtraOk returns a tuple with the Extra field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetExtraOk() (*map[string]interface{}, bool) {
	if o == nil || o.Extra == nil {
		return nil, false
	}
	return &o.Extra, true
}

// HasExtra returns a boolean if a field has been set.
func (o *InvoiceOut) HasExtra() bool {
	if o != nil && o.Extra != nil {
		return true
	}

	return false
}

// SetExtra gets a reference to the given map[string]interface{} and assigns it to the Extra field.
func (o *InvoiceOut) SetExtra(v map[string]interface{}) {
	o.Extra = v
}

// GetNote returns the Note field value if set, zero value otherwise.
func (o *InvoiceOut) GetNote() string {
	if o == nil || o.Note == nil {
		var ret string
		return ret
	}
	return *o.Note
}

// GetNoteOk returns a tuple with the Note field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetNoteOk() (*string, bool) {
	if o == nil || o.Note == nil {
		return nil, false
	}
	return o.Note, true
}

// HasNote returns a boolean if a field has been set.
func (o *InvoiceOut) HasNote() bool {
	if o != nil && o.Note != nil {
		return true
	}

	return false
}

// SetNote gets a reference to the given string and assigns it to the Note field.
func (o *InvoiceOut) SetNote(v string) {
	o.Note = &v
}

// GetExpiration returns the Expiration field value if set, zero value otherwise.
func (o *InvoiceOut) GetExpiration() int32 {
	if o == nil || o.Expiration == nil {
		var ret int32
		return ret
	}
	return *o.Expiration
}

// GetExpirationOk returns a tuple with the Expiration field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetExpirationOk() (*int32, bool) {
	if o == nil || o.Expiration == nil {
		return nil, false
	}
	return o.Expiration, true
}

// HasExpiration returns a boolean if a field has been set.
func (o *InvoiceOut) HasExpiration() bool {
	if o != nil && o.Expiration != nil {
		return true
	}

	return false
}

// SetExpiration gets a reference to the given int32 and assigns it to the Expiration field.
func (o *InvoiceOut) SetExpiration(v int32) {
	o.Expiration = &v
}

// GetStatus returns the Status field value
func (o *InvoiceOut) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetStatusOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *InvoiceOut) SetStatus(v string) {
	o.Status = v
}

// GetFailedMessage returns the FailedMessage field value if set, zero value otherwise.
func (o *InvoiceOut) GetFailedMessage() string {
	if o == nil || o.FailedMessage == nil {
		var ret string
		return ret
	}
	return *o.FailedMessage
}

// GetFailedMessageOk returns a tuple with the FailedMessage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetFailedMessageOk() (*string, bool) {
	if o == nil || o.FailedMessage == nil {
		return nil, false
	}
	return o.FailedMessage, true
}

// HasFailedMessage returns a boolean if a field has been set.
func (o *InvoiceOut) HasFailedMessage() bool {
	if o != nil && o.FailedMessage != nil {
		return true
	}

	return false
}

// SetFailedMessage gets a reference to the given string and assigns it to the FailedMessage field.
func (o *InvoiceOut) SetFailedMessage(v string) {
	o.FailedMessage = &v
}

// GetCreatedAt returns the CreatedAt field value
func (o *InvoiceOut) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *InvoiceOut) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetPaidAt returns the PaidAt field value if set, zero value otherwise.
func (o *InvoiceOut) GetPaidAt() time.Time {
	if o == nil || o.PaidAt == nil {
		var ret time.Time
		return ret
	}
	return *o.PaidAt
}

// GetPaidAtOk returns a tuple with the PaidAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InvoiceOut) GetPaidAtOk() (*time.Time, bool) {
	if o == nil || o.PaidAt == nil {
		return nil, false
	}
	return o.PaidAt, true
}

// HasPaidAt returns a boolean if a field has been set.
func (o *InvoiceOut) HasPaidAt() bool {
	if o != nil && o.PaidAt != nil {
		return true
	}

	return false
}

// SetPaidAt gets a reference to the given time.Time and assigns it to the PaidAt field.
func (o *InvoiceOut) SetPaidAt(v time.Time) {
	o.PaidAt = &v
}

// GetFailedAt returns the FailedAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetFailedAt() time.Time {
	if o == nil || o.FailedAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.FailedAt.Get()
}

// GetFailedAtOk returns a tuple with the FailedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetFailedAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.FailedAt.Get(), o.FailedAt.IsSet()
}

// HasFailedAt returns a boolean if a field has been set.
func (o *InvoiceOut) HasFailedAt() bool {
	if o != nil && o.FailedAt.IsSet() {
		return true
	}

	return false
}

// SetFailedAt gets a reference to the given NullableTime and assigns it to the FailedAt field.
func (o *InvoiceOut) SetFailedAt(v time.Time) {
	o.FailedAt.Set(&v)
}
// SetFailedAtNil sets the value for FailedAt to be an explicit nil
func (o *InvoiceOut) SetFailedAtNil() {
	o.FailedAt.Set(nil)
}

// UnsetFailedAt ensures that no value is present for FailedAt, not even an explicit nil
func (o *InvoiceOut) UnsetFailedAt() {
	o.FailedAt.Unset()
}

// GetCanceledAt returns the CanceledAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetCanceledAt() time.Time {
	if o == nil || o.CanceledAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.CanceledAt.Get()
}

// GetCanceledAtOk returns a tuple with the CanceledAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetCanceledAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.CanceledAt.Get(), o.CanceledAt.IsSet()
}

// HasCanceledAt returns a boolean if a field has been set.
func (o *InvoiceOut) HasCanceledAt() bool {
	if o != nil && o.CanceledAt.IsSet() {
		return true
	}

	return false
}

// SetCanceledAt gets a reference to the given NullableTime and assigns it to the CanceledAt field.
func (o *InvoiceOut) SetCanceledAt(v time.Time) {
	o.CanceledAt.Set(&v)
}
// SetCanceledAtNil sets the value for CanceledAt to be an explicit nil
func (o *InvoiceOut) SetCanceledAtNil() {
	o.CanceledAt.Set(nil)
}

// UnsetCanceledAt ensures that no value is present for CanceledAt, not even an explicit nil
func (o *InvoiceOut) UnsetCanceledAt() {
	o.CanceledAt.Unset()
}

// GetExpiredAt returns the ExpiredAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvoiceOut) GetExpiredAt() time.Time {
	if o == nil || o.ExpiredAt.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiredAt.Get()
}

// GetExpiredAtOk returns a tuple with the ExpiredAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvoiceOut) GetExpiredAtOk() (*time.Time, bool) {
	if o == nil  {
		return nil, false
	}
	return o.ExpiredAt.Get(), o.ExpiredAt.IsSet()
}

// HasExpiredAt returns a boolean if a field has been set.
func (o *InvoiceOut) HasExpiredAt() bool {
	if o != nil && o.ExpiredAt.IsSet() {
		return true
	}

	return false
}

// SetExpiredAt gets a reference to the given NullableTime and assigns it to the ExpiredAt field.
func (o *InvoiceOut) SetExpiredAt(v time.Time) {
	o.ExpiredAt.Set(&v)
}
// SetExpiredAtNil sets the value for ExpiredAt to be an explicit nil
func (o *InvoiceOut) SetExpiredAtNil() {
	o.ExpiredAt.Set(nil)
}

// UnsetExpiredAt ensures that no value is present for ExpiredAt, not even an explicit nil
func (o *InvoiceOut) UnsetExpiredAt() {
	o.ExpiredAt.Unset()
}

func (o InvoiceOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if o.Uid.IsSet() {
		toSerialize["uid"] = o.Uid.Get()
	}
	if o.UserId.IsSet() {
		toSerialize["userId"] = o.UserId.Get()
	}
	if true {
		toSerialize["channel"] = o.Channel
	}
	if true {
		toSerialize["currency"] = o.Currency
	}
	if true {
		toSerialize["amount"] = o.Amount
	}
	if o.Credentials != nil {
		toSerialize["credentials"] = o.Credentials
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	if o.Extra != nil {
		toSerialize["extra"] = o.Extra
	}
	if o.Note != nil {
		toSerialize["note"] = o.Note
	}
	if o.Expiration != nil {
		toSerialize["expiration"] = o.Expiration
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if o.FailedMessage != nil {
		toSerialize["failedMessage"] = o.FailedMessage
	}
	if true {
		toSerialize["createdAt"] = o.CreatedAt
	}
	if o.PaidAt != nil {
		toSerialize["paidAt"] = o.PaidAt
	}
	if o.FailedAt.IsSet() {
		toSerialize["failedAt"] = o.FailedAt.Get()
	}
	if o.CanceledAt.IsSet() {
		toSerialize["canceledAt"] = o.CanceledAt.Get()
	}
	if o.ExpiredAt.IsSet() {
		toSerialize["expiredAt"] = o.ExpiredAt.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableInvoiceOut struct {
	value *InvoiceOut
	isSet bool
}

func (v NullableInvoiceOut) Get() *InvoiceOut {
	return v.value
}

func (v *NullableInvoiceOut) Set(val *InvoiceOut) {
	v.value = val
	v.isSet = true
}

func (v NullableInvoiceOut) IsSet() bool {
	return v.isSet
}

func (v *NullableInvoiceOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInvoiceOut(val *InvoiceOut) *NullableInvoiceOut {
	return &NullableInvoiceOut{value: val, isSet: true}
}

func (v NullableInvoiceOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInvoiceOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


