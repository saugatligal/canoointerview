package com.saugatligal.mobileappchallenge.hotels.domain

import com.google.gson.annotations.SerializedName


data class HotelModelList(
    val data: Data,
)

data class Data(
    val propertySearch: PropertySearch,
)

data class PropertySearch(
    @SerializedName("__typename")
    val typename: String,
    val filterMetadata: FilterMetadata,
    val universalSortAndFilter: UniversalSortAndFilter,
    val properties: List<Property>,
    val propertySearchListings: List<PropertySearchListing>,
    val summary: Summary,
    val searchCriteria: SearchCriteria,
    val shoppingContext: ShoppingContext,
    val map: Map,
    val clickstream: Clickstream,
)

data class FilterMetadata(
    @SerializedName("__typename")
    val typename: String,
    val amenities: List<Amenity>,
    val neighborhoods: List<Neighborhood>,
    val priceRange: PriceRange,
)

data class Amenity(
    @SerializedName("__typename")
    val typename: String,
    val id: Long,
)

data class Neighborhood(
    @SerializedName("__typename")
    val typename: String,
    val name: String,
    val regionId: String,
)

data class PriceRange(
    @SerializedName("__typename")
    val typename: String,
    val max: Double,
    val min: Double,
)

data class UniversalSortAndFilter(
    @SerializedName("__typename")
    val typename: String,
    val toolbar: Toolbar,
    val revealAction: RevealAction,
    val applyAction: ApplyAction,
    val filterSections: List<FilterSection>,
    val sortSections: List<SortSection>,
)

data class Toolbar(
    @SerializedName("__typename")
    val typename: String,
    val primary: String,
    val actions: Actions,
)

data class Actions(
    @SerializedName("__typename")
    val typename: String,
    val primary: Primary,
    val secondaries: List<Secondary>,
)

data class Primary(
    @SerializedName("__typename")
    val typename: String,
    val primary: Any?,
    val action: Action,
)

data class Action(
    @SerializedName("__typename")
    val typename: String,
    val actionType: String,
    val accessibility: Any?,
    val analytics: Analytics,
)

data class Analytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Secondary(
    @SerializedName("__typename")
    val typename: String,
    val primary: String,
    val disabled: Boolean,
    val action: Action2,
)

data class Action2(
    @SerializedName("__typename")
    val typename: String,
    val actionType: String,
    val accessibility: String,
    val analytics: Analytics2,
)

data class Analytics2(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class RevealAction(
    @SerializedName("__typename")
    val typename: String,
    val primary: String,
    val action: Action3,
    val accessibility: String,
    val badge: Long,
    val disabled: Boolean,
    val icon: Icon,
)

data class Action3(
    @SerializedName("__typename")
    val typename: String,
    val actionType: String,
    val accessibility: Any?,
    val analytics: Analytics3,
)

data class Analytics3(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Icon(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class ApplyAction(
    @SerializedName("__typename")
    val typename: String,
    val primary: String,
    val action: Action4,
    val accessibility: String,
    val badge: Any?,
    val disabled: Boolean,
    val icon: Any?,
)

data class Action4(
    @SerializedName("__typename")
    val typename: String,
    val actionType: String,
    val accessibility: Any?,
    val analytics: Analytics4,
)

data class Analytics4(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class FilterSection(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
    val fields: List<Field>,
)

data class Field(
    @SerializedName("__typename")
    val typename: String,
    val primary: String?,
    val secondary: Any?,
    val action: Action5?,
    val id: String?,
    val label: Any?,
    val placeholder: String?,
    val selected: Any?,
    val typeaheadInfo: TypeaheadInfo?,
    val icon: Icon2?,
    val analytics: Analytics6?,
    val expando: Expando?,
    val multiSelectionOptions: List<MultiSelectionOption>?,
    val range: Range?,
    val options: List<Option>?,
    val tileMultiSelectionOptions: List<TileMultiSelectionOption>?,
)

data class Action5(
    @SerializedName("__typename")
    val typename: String,
    val actionType: String,
    val accessibility: Any?,
    val analytics: Analytics5,
)

data class Analytics5(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class TypeaheadInfo(
    @SerializedName("__typename")
    val typename: String,
    val client: String,
    val isDestination: Boolean,
    val lineOfBusiness: String,
    val maxNumberOfResults: Long,
    val packageType: Any?,
    val personalize: Boolean,
    val regionType: Long,
    val typeaheadFeatures: String,
)

data class Icon2(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class Analytics6(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Expando(
    @SerializedName("__typename")
    val typename: String,
    val threshold: Long,
    val collapseLabel: String,
    val expandLabel: String,
    val collapseAnalytics: CollapseAnalytics,
    val expandAnalytics: ExpandAnalytics,
)

data class CollapseAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class ExpandAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class MultiSelectionOption(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val primary: String,
    val secondary: String?,
    val icon: Any?,
    val analytics: Analytics7,
    val value: String,
    val description: String?,
    val selected: Boolean,
    val disabled: Boolean,
    val default: Boolean,
    val selectAnalytics: SelectAnalytics,
    val deselectAnalytics: DeselectAnalytics,
)

data class Analytics7(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class SelectAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class DeselectAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Range(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val primary: String,
    val secondary: Any?,
    val icon: Any?,
    val analytics: Analytics8,
    val selected: Selected,
    val characteristics: Characteristics,
)

data class Analytics8(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Selected(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val min: Long,
    val max: Long,
)

data class Characteristics(
    @SerializedName("__typename")
    val typename: String,
    val min: Long,
    val max: Long,
    val step: Long,
    val labels: List<Label>,
)

data class Label(
    @SerializedName("__typename")
    val typename: String,
    val label: String,
    val value: Long,
)

data class Option(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val primary: String,
    val secondary: Any?,
    val icon: Any?,
    val analytics: Analytics9,
    val value: String,
    val description: Any?,
    val selected: Boolean,
    val disabled: Boolean,
    val default: Boolean,
    val selectAnalytics: SelectAnalytics2,
    val deselectAnalytics: DeselectAnalytics2,
)

data class Analytics9(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class SelectAnalytics2(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class DeselectAnalytics2(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class TileMultiSelectionOption(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val primary: String,
    val secondary: String?,
    val icon: Icon3?,
    val analytics: Analytics10,
    val value: String,
    val description: Any?,
    val selected: Boolean,
    val disabled: Boolean,
    val default: Boolean,
    val selectAnalytics: SelectAnalytics3,
    val deselectAnalytics: DeselectAnalytics3,
)

data class Icon3(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class Analytics10(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class SelectAnalytics3(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class DeselectAnalytics3(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class SortSection(
    @SerializedName("__typename")
    val typename: String,
    val title: Any?,
    val fields: List<Field2>,
)

data class Field2(
    @SerializedName("__typename")
    val typename: String,
    val primary: String,
    val secondary: Any?,
    val dropdownFilterOptions: List<DropdownFilterOption>,
)

data class DropdownFilterOption(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val primary: String,
    val secondary: Any?,
    val icon: Any?,
    val analytics: Analytics11,
    val value: String,
    val description: Any?,
    val selected: Boolean,
    val disabled: Boolean,
    val default: Boolean,
    val selectAnalytics: SelectAnalytics4,
    val deselectAnalytics: DeselectAnalytics4,
)

data class Analytics11(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class SelectAnalytics4(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class DeselectAnalytics4(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Property(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val featuredMessages: List<Any?>,
    val name: String,
    val availability: Availability,
    val propertyImage: PropertyImage,
    val destinationInfo: DestinationInfo,
    val legalDisclaimer: Any?,
    val listingFooter: Any?,
    val mapMarker: MapMarker,
    val neighborhood: Neighborhood2,
    val offerBadge: OfferBadge?,
    val offerSummary: OfferSummary,
    val pinnedDetails: Any?,
    @SerializedName("Price")
    val price: HotelPrice,
    val priceAfterLoyaltyPointsApplied: PriceAfterLoyaltyPointsApplied,
    val propertyFees: List<Any?>,
    val reviews: Reviews,
    val sponsoredListing: Any?,
    val star: Any?,
    val supportingMessages: Any?,
    val regionId: String,
    val priceMetadata: PriceMetadata,
    val saveTripItem: Any?,
)

data class Availability(
    @SerializedName("__typename")
    val typename: String,
    val available: Boolean,
    val minRoomsLeft: Long?,
)

data class PropertyImage(
    @SerializedName("__typename")
    val typename: String,
    val alt: String,
    val fallbackImage: Any?,
    val image: Image,
    val subjectId: Long,
)

data class Image(
    @SerializedName("__typename")
    val typename: String,
    val description: String,
    val url: String,
)

data class DestinationInfo(
    @SerializedName("__typename")
    val typename: String,
    val distanceFromDestination: DistanceFromDestination,
    val distanceFromMessaging: Any?,
    val regionId: String,
)

data class DistanceFromDestination(
    @SerializedName("__typename")
    val typename: String,
    val unit: String,
    val value: Double,
)

data class MapMarker(
    @SerializedName("__typename")
    val typename: String,
    val label: String,
    val latLong: LatLong,
)

data class LatLong(
    @SerializedName("__typename")
    val typename: String,
    val latitude: Double,
    val longitude: Double,
)

data class Neighborhood2(
    @SerializedName("__typename")
    val typename: String,
    val name: String,
)

data class OfferBadge(
    @SerializedName("__typename")
    val typename: String,
    val primary: Primary2,
    val secondary: Secondary2?,
)

data class Primary2(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    @SerializedName("theme_temp")
    val themeTemp: String,
    @SerializedName("icon_temp")
    val iconTemp: IconTemp?,
    val mark: Any?,
)

data class IconTemp(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
)

data class Secondary2(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    @SerializedName("theme_temp")
    val themeTemp: String,
    @SerializedName("icon_temp")
    val iconTemp: IconTemp2?,
    val mark: Any?,
)

data class IconTemp2(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
)

data class OfferSummary(
    @SerializedName("__typename")
    val typename: String,
    val messages: List<Message>,
    val attributes: List<Attribute>,
)

data class Message(
    @SerializedName("__typename")
    val typename: String,
    val message: String,
    val theme: String?,
    val type: String,
    val mark: Mark?,
)

data class Mark(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val token: String,
    val description: String,
)

data class Attribute(
    @SerializedName("__typename")
    val typename: String,
    val type: String,
)

data class HotelPrice(
    @SerializedName("__typename")
    val typename: String,
    val options: List<Option2>,
    val priceMessaging: Any?,
    val lead: Lead,
    val strikeOut: StrikeOut2?,
    val displayMessages: List<DisplayMessage>,
    val strikeOutType: String,
    val priceMessages: List<PriceMessage>,
)

data class Option2(
    @SerializedName("__typename")
    val typename: String,
    val strikeOut: StrikeOut?,
    val disclaimer: Disclaimer?,
    val formattedDisplayPrice: String,
)

data class StrikeOut(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val formatted: String,
)

data class Disclaimer(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class Lead(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val currencyInfo: CurrencyInfo,
    val formatted: String,
)

data class CurrencyInfo(
    @SerializedName("__typename")
    val typename: String,
    val code: String,
    val symbol: String,
)

data class StrikeOut2(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val currencyInfo: CurrencyInfo2,
    val formatted: String,
)

data class CurrencyInfo2(
    @SerializedName("__typename")
    val typename: String,
    val code: String,
    val symbol: String,
)

data class DisplayMessage(
    @SerializedName("__typename")
    val typename: String,
    val lineItems: List<LineItem>,
)

data class LineItem(
    @SerializedName("__typename")
    val typename: String,
    val disclaimer: Disclaimer2?,
    val price: Price2?,
    val role: String?,
    val accessibilityLabel: Any?,
    val mark: Any?,
    val state: Any?,
    val value: String?,
    val badge: Any?,
)

data class Disclaimer2(
    @SerializedName("__typename")
    val typename: String,
    val content: List<String>,
    val title: Any?,
)

data class Price2(
    @SerializedName("__typename")
    val typename: String,
    val formatted: String,
    val accessibilityLabel: String,
)

data class PriceMessage(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class PriceAfterLoyaltyPointsApplied(
    @SerializedName("__typename")
    val typename: String,
    val options: List<Any?>,
    val lead: Any?,
)

data class Reviews(
    @SerializedName("__typename")
    val typename: String,
    val score: Double,
    val total: Long,
)

data class PriceMetadata(
    @SerializedName("__typename")
    val typename: String,
    val discountType: String?,
    val rateDiscount: RateDiscount?,
    val totalDiscountPercentage: Long?,
)

data class RateDiscount(
    @SerializedName("__typename")
    val typename: String,
    val description: String,
)

data class PropertySearchListing(
    @SerializedName("__typename")
    val typename: String,
    val id: String?,
    val featuredMessages: List<Any?>?,
    val name: String?,
    val availability: Availability2?,
    val propertyImage: PropertyImage2?,
    val destinationInfo: DestinationInfo2?,
    val legalDisclaimer: Any?,
    val listingFooter: Any?,
    val mapMarker: MapMarker2?,
    val neighborhood: Neighborhood3?,
    val offerBadge: OfferBadge2?,
    val offerSummary: OfferSummary2?,
    val pinnedDetails: Any?,
    val price: Price3?,
    val priceAfterLoyaltyPointsApplied: PriceAfterLoyaltyPointsApplied2?,
    val propertyFees: List<Any?>?,
    val reviews: Reviews2?,
    val sponsoredListing: Any?,
    val star: Any?,
    val supportingMessages: Any?,
    val regionId: String?,
    val priceMetadata: PriceMetadata2?,
    val saveTripItem: Any?,
)

data class Availability2(
    @SerializedName("__typename")
    val typename: String,
    val available: Boolean,
    val minRoomsLeft: Long?,
)

data class PropertyImage2(
    @SerializedName("__typename")
    val typename: String,
    val alt: String,
    val fallbackImage: Any?,
    val image: Image2,
    val subjectId: Long,
)

data class Image2(
    @SerializedName("__typename")
    val typename: String,
    val description: String,
    val url: String,
)

data class DestinationInfo2(
    @SerializedName("__typename")
    val typename: String,
    val distanceFromDestination: DistanceFromDestination2,
    val distanceFromMessaging: Any?,
    val regionId: String,
)

data class DistanceFromDestination2(
    @SerializedName("__typename")
    val typename: String,
    val unit: String,
    val value: Double,
)

data class MapMarker2(
    @SerializedName("__typename")
    val typename: String,
    val label: String,
    val latLong: LatLong2,
)

data class LatLong2(
    @SerializedName("__typename")
    val typename: String,
    val latitude: Double,
    val longitude: Double,
)

data class Neighborhood3(
    @SerializedName("__typename")
    val typename: String,
    val name: String,
)

data class OfferBadge2(
    @SerializedName("__typename")
    val typename: String,
    val primary: Primary3,
    val secondary: Secondary3?,
)

data class Primary3(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    @SerializedName("theme_temp")
    val themeTemp: String,
    @SerializedName("icon_temp")
    val iconTemp: IconTemp3?,
    val mark: Any?,
)

data class IconTemp3(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
)

data class Secondary3(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    @SerializedName("theme_temp")
    val themeTemp: String,
    @SerializedName("icon_temp")
    val iconTemp: IconTemp4?,
    val mark: Any?,
)

data class IconTemp4(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
)

data class OfferSummary2(
    @SerializedName("__typename")
    val typename: String,
    val messages: List<Message2>,
    val attributes: List<Attribute2>,
)

data class Message2(
    @SerializedName("__typename")
    val typename: String,
    val message: String,
    val theme: String?,
    val type: String,
    val mark: Mark2?,
)

data class Mark2(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val token: String,
    val description: String,
)

data class Attribute2(
    @SerializedName("__typename")
    val typename: String,
    val type: String,
)

data class Price3(
    @SerializedName("__typename")
    val typename: String,
    val options: List<Option3>,
    val priceMessaging: Any?,
    val lead: Lead2,
    val strikeOut: StrikeOut4?,
    val displayMessages: List<DisplayMessage2>,
    val strikeOutType: String,
    val priceMessages: List<PriceMessage2>,
)

data class Option3(
    @SerializedName("__typename")
    val typename: String,
    val strikeOut: StrikeOut3?,
    val disclaimer: Disclaimer3?,
    val formattedDisplayPrice: String,
)

data class StrikeOut3(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val formatted: String,
)

data class Disclaimer3(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class Lead2(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val currencyInfo: CurrencyInfo3,
    val formatted: String,
)

data class CurrencyInfo3(
    @SerializedName("__typename")
    val typename: String,
    val code: String,
    val symbol: String,
)

data class StrikeOut4(
    @SerializedName("__typename")
    val typename: String,
    val amount: Double,
    val currencyInfo: CurrencyInfo4,
    val formatted: String,
)

data class CurrencyInfo4(
    @SerializedName("__typename")
    val typename: String,
    val code: String,
    val symbol: String,
)

data class DisplayMessage2(
    @SerializedName("__typename")
    val typename: String,
    val lineItems: List<LineItem2>,
)

data class LineItem2(
    @SerializedName("__typename")
    val typename: String,
    val disclaimer: Disclaimer4?,
    val price: Price4?,
    val role: String?,
    val accessibilityLabel: Any?,
    val mark: Any?,
    val state: Any?,
    val value: String?,
    val badge: Any?,
)

data class Disclaimer4(
    @SerializedName("__typename")
    val typename: String,
    val content: List<String>,
    val title: Any?,
)

data class Price4(
    @SerializedName("__typename")
    val typename: String,
    val formatted: String,
    val accessibilityLabel: String,
)

data class PriceMessage2(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class PriceAfterLoyaltyPointsApplied2(
    @SerializedName("__typename")
    val typename: String,
    val options: List<Any?>,
    val lead: Any?,
)

data class Reviews2(
    @SerializedName("__typename")
    val typename: String,
    val score: Double,
    val total: Long,
)

data class PriceMetadata2(
    @SerializedName("__typename")
    val typename: String,
    val discountType: String?,
    val rateDiscount: RateDiscount2?,
    val totalDiscountPercentage: Long?,
)

data class RateDiscount2(
    @SerializedName("__typename")
    val typename: String,
    val description: String,
)

data class Summary(
    @SerializedName("__typename")
    val typename: String,
    val matchedPropertiesSize: Long,
    val pricingScheme: PricingScheme,
    val regionCompression: Any?,
    val loyaltyInfo: LoyaltyInfo,
    val resultsTitleModel: ResultsTitleModel,
    val resultsSummary: List<ResultsSummary>,
)

data class PricingScheme(
    @SerializedName("__typename")
    val typename: String,
    val type: String,
)

data class LoyaltyInfo(
    @SerializedName("__typename")
    val typename: String,
    val saveWithPointsMessage: Any?,
    val saveWithPointsActionMessage: Any?,
)

data class ResultsTitleModel(
    @SerializedName("__typename")
    val typename: String,
    val header: String,
)

data class ResultsSummary(
    @SerializedName("__typename")
    val typename: String,
    val accessibilityLabel: String?,
    val value: String?,
    val link: Link?,
)

data class Link(
    @SerializedName("__typename")
    val typename: String,
    val clientSideAnalytics: ClientSideAnalytics,
    val uri: Uri,
)

data class ClientSideAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Uri(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class SearchCriteria(
    @SerializedName("__typename")
    val typename: String,
    val resolvedDateRange: ResolvedDateRange,
)

data class ResolvedDateRange(
    @SerializedName("__typename")
    val typename: String
//    @SerializedName("CheckInDate")
//    val checkInDate: CheckinDate,
//    @SerializedName("CheckOnDate")
//    val checkOutDate: CheckinDate,
)

//data class CheckinDate(
//    @SerializedName("__typename")
//    val typename: String,
//    val day: Long,
//    val month: Long,
//    val year: Long,
//)
//
//data class CheckoutDate(
//    @SerializedName("__typename")
//    val typename: String,
//    val day: Long,
//    val month: Long,
//    val year: Long,
//)

data class ShoppingContext(
    @SerializedName("__typename")
    val typename: String,
    val multiItem: Any?,
)

data class Map(
    @SerializedName("__typename")
    val typename: String,
    val subtitle: Any?,
)

data class Clickstream(
    @SerializedName("__typename")
    val typename: String,
    val searchResultsViewed: Any?,
)

