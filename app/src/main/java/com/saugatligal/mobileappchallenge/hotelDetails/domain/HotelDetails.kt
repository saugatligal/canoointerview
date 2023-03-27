package com.saugatligal.mobileappchallenge.hotelDetails

import com.google.gson.annotations.SerializedName

data class HotelDetails(
    val data: Data,
)

data class Data(
    val propertyInfo: PropertyInfo,
)

data class PropertyInfo(
    @SerializedName("__typename")
    val typename: String,
    val summary: Summary,
    val reviewInfo: ReviewInfo
)

data class Summary(
    val name: String,
    val tagline: String,
    val location: Location
)

data class Map(
    @SerializedName("__typename")
    val typename: String,
    val markers: List<Marker>,
)

data class Marker(
    @SerializedName("__typename")
    val typename: String,
    val mapMarker: MapMarker,
    val poiContent: PoiContent?,
    val subtitle: String?,
    val title: String,
)

data class MapMarker(
    @SerializedName("__typename")
    val typename: String,
    val icon: String,
    val latLong: LatLong,
    val type: String,
)

data class LatLong(
    @SerializedName("__typename")
    val typename: String,
    val latitude: Double,
    val longitude: Double,
)

data class PoiContent(
    @SerializedName("__typename")
    val typename: String,
    val description: Any?,
    val id: String,
    val image: Any?,
)

data class Policies(
    @SerializedName("__typename")
    val typename: String,
    val checkinEnd: Any?,
    val checkinInstructions: List<String>,
    val checkinMinAge: Any?,
    val checkinStart: Any?,
    val checkoutTime: Any?,
    val childAndBed: ChildAndBed,
    val needToKnow: NeedToKnow,
    val paymentOptions: List<Any?>,
    val pets: Pets,
    val shouldMention: ShouldMention,
)

data class ChildAndBed(
    @SerializedName("__typename")
    val typename: String,
    val body: List<String>,
    val descriptions: List<Any?>,
    val title: Any?,
)

data class NeedToKnow(
    @SerializedName("__typename")
    val typename: String,
    val body: List<String>,
    val descriptions: List<Any?>,
    val title: String,
)

data class Pets(
    @SerializedName("__typename")
    val typename: String,
    val body: List<String>,
    val descriptions: List<Any?>,
    val title: String,
)

data class ShouldMention(
    @SerializedName("__typename")
    val typename: String,
    val body: List<String>,
    val descriptions: List<Any?>,
    val title: String,
)

data class StarRatingIcon(
    @SerializedName("__typename")
    val typename: String,
    val token: String,
)

data class Overview(
    @SerializedName("__typename")
    val typename: String,
    val vipMessaging: Any?,
    val inventoryType: Any?,
    val accessibilityLabel: String,
    val label: Any?,
    val propertyRating: PropertyRating,
)

data class PropertyRating(
    @SerializedName("__typename")
    val typename: String,
    val rating: Float,
    val accessibility: String,
    val icon: Icon,
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

data class Amenities(
    @SerializedName("__typename")
    val typename: String,
    val amenities: List<Amenity>,
    val topAmenities: TopAmenities,
    val propertyContentPreferences: Any?,
    val amenitiesDialog: AmenitiesDialog,
    val takeover: Takeover,
)

data class Amenity(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
    val sections: List<Any?>,
    val header: Header,
    val contents: List<Content>,
)

data class Header(
    @SerializedName("__typename")
    val typename: String,
    val icon: Any?,
    val text: String,
    val subText: Any?,
)

data class Content(
    @SerializedName("__typename")
    val typename: String,
    val header: Header2,
    val icon: Icon2,
    val jumpLink: Any?,
    val items: List<Item>,
)

data class Header2(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val mark: Any?,
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

data class Item(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val state: Any?,
    val moreInfo: Any?,
    val icon: Any?,
)

data class TopAmenities(
    @SerializedName("__typename")
    val typename: String,
    val header: Header3,
    val icon: Any?,
    val jumpLink: Any?,
    val items: List<Item2>,
)

data class Header3(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val mark: Any?,
)

data class Item2(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val state: Any?,
    val moreInfo: Any?,
    val icon: Icon3,
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

data class AmenitiesDialog(
    @SerializedName("__typename")
    val typename: String,
    val trigger: Trigger,
    val toolbar: Toolbar,
)

data class Trigger(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val icon: Icon4,
    val clientSideAnalytics: ClientSideAnalytics,
)

data class Icon4(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class ClientSideAnalytics(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class Toolbar(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
)

data class Takeover(
    @SerializedName("__typename")
    val typename: String,
    val amenityClosures: Any?,
    val highlight: List<Highlight>,
    val property: List<Property>,
)

data class Highlight(
    @SerializedName("__typename")
    val typename: String,
    val header: Header4,
    val icon: Any?,
    val jumpLink: Any?,
    val items: List<Item3>,
)

data class Header4(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val mark: Any?,
)

data class Item3(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val state: Any?,
    val moreInfo: Any?,
    val icon: Icon5,
)

data class Icon5(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class Property(
    @SerializedName("__typename")
    val typename: String,
    val header: Header5,
    val icon: Icon6,
    val jumpLink: Any?,
    val items: List<Item4>,
)

data class Header5(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val mark: Any?,
)

data class Icon6(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class Item4(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val state: Any?,
    val moreInfo: Any?,
    val icon: Any?,
)

data class Location(
    @SerializedName("__typename")
    val typename: String,
    val address: Address
)

data class Address(
    @SerializedName("__typename")
    val typename: String,
    val addressLine: String
)

data class Coordinates(
    @SerializedName("__typename")
    val typename: String,
    val latitude: Double,
    val longitude: Double,
)

data class MultiCityRegion(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
)

data class WhatsAround(
    @SerializedName("__typename")
    val typename: String,
    val editorial: Editorial,
)

data class Editorial(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
    val content: List<String>,
)

data class MapDialog(
    @SerializedName("__typename")
    val typename: String,
    val trigger: Trigger2,
    val toolbar: Any?,
)

data class Trigger2(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val icon: Icon7,
    val clientSideAnalytics: Any?,
)

data class Icon7(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class StaticImage(
    @SerializedName("__typename")
    val typename: String,
    val description: String,
    val url: String,
    val aspectRatio: Any?,
)

data class PropertyGallery(
    @SerializedName("__typename")
    val typename: String,
    val imagesGrouped: Any?,
    val images: List<Image>,
    val accessibilityLabel: String,
    val thumbnailGalleryDialog: ThumbnailGalleryDialog,
    val mediaGalleryDialog: MediaGalleryDialog,
)

data class Image(
    @SerializedName("__typename")
    val typename: String,
    val accessibilityText: String,
    val imageId: Any?,
    val image: Image2,
)

data class Image2(
    @SerializedName("__typename")
    val typename: String,
    val url: String,
    val description: String,
)

data class ThumbnailGalleryDialog(
    @SerializedName("__typename")
    val typename: String,
    val trigger: Trigger3,
    val toolbar: Toolbar2,
)

data class Trigger3(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val icon: Icon8,
    val clientSideAnalytics: Any?,
)

data class Icon8(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class Toolbar2(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
    val icon: Icon9,
    val clientSideAnalytics: Any?,
)

data class Icon9(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class MediaGalleryDialog(
    @SerializedName("__typename")
    val typename: String,
    val trigger: Trigger4,
    val toolbar: Toolbar3,
)

data class Trigger4(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val icon: Any?,
    val clientSideAnalytics: Any?,
)

data class Toolbar3(
    @SerializedName("__typename")
    val typename: String,
    val title: String,
    val icon: Icon10,
    val clientSideAnalytics: Any?,
)

data class Icon10(
    @SerializedName("__typename")
    val typename: String,
    val id: String,
    val description: String,
    val size: Any?,
    val token: String,
    val theme: Any?,
)

data class ReviewInfo(
    @SerializedName("__typename")
    val typename: String,
    val summary: Summary2,
)

data class Summary2(
    @SerializedName("__typename")
    val typename: String,
    val overallScoreWithDescriptionA11y: OverallScoreWithDescriptionA11y
)

data class OverallScoreWithDescriptionA11y(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
)

data class PropertyReviewCountDetails(
    @SerializedName("__typename")
    val typename: String,
    val shortDescription: String,
)

data class HighlightMessage(
    @SerializedName("__typename")
    val typename: String,
    val subtitle: Subtitle,
)

data class Subtitle(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
)

data class SeeAllAction(
    @SerializedName("__typename")
    val typename: String,
    val trigger: Trigger5,
)

data class Trigger5(
    @SerializedName("__typename")
    val typename: String,
    val clientSideAnalytics: ClientSideAnalytics2,
)

data class ClientSideAnalytics2(
    @SerializedName("__typename")
    val typename: String,
    val linkName: String,
    val referrerId: String,
)

data class PropertyContentSectionGroups(
    @SerializedName("__typename")
    val typename: String,
    val cleanliness: Any?,
    val aboutThisProperty: AboutThisProperty,
    val policies: Policies2,
    val importantInfo: Any?,
)

data class AboutThisProperty(
    @SerializedName("__typename")
    val typename: String,
    val sectionName: Any?,
    val sections: List<Section>,
)

data class Section(
    @SerializedName("__typename")
    val typename: String,
    val sectionName: Any?,
    val header: Header6,
    val bodySubSections: List<BodySubSection>,
    val action: Any?,
)

data class Header6(
    @SerializedName("__typename")
    val typename: String,
    val icon: Any?,
    val text: String,
    val subText: Any?,
)

data class BodySubSection(
    @SerializedName("__typename")
    val typename: String,
    val elements: List<Element>,
    val expando: Any?,
    val maxColumns: Long,
)

data class Element(
    @SerializedName("__typename")
    val typename: String,
    val header: Header7,
    val items: List<Item5>,
)

data class Header7(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val icon: Any?,
    val headerImage: Any?,
)

data class Item5(
    @SerializedName("__typename")
    val typename: String,
    val content: Content2,
)

data class Content2(
    @SerializedName("__typename")
    val typename: String,
    val text: String?,
    val markupType: String?,
    val primary: Primary?,
    val secondary: Any?,
)

data class Primary(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val accessibilityLabel: Any?,
    val icon: Any?,
)

data class Policies2(
    @SerializedName("__typename")
    val typename: String,
    val sectionName: String,
    val sections: List<Section2>,
)

data class Section2(
    @SerializedName("__typename")
    val typename: String,
    val sectionName: Any?,
    val header: Header8,
    val bodySubSections: List<BodySubSection2>,
    val action: Any?,
)

data class Header8(
    @SerializedName("__typename")
    val typename: String,
    val icon: Any?,
    val text: String,
    val subText: Any?,
)

data class BodySubSection2(
    @SerializedName("__typename")
    val typename: String,
    val elements: List<Element2>,
    val expando: Any?,
    val maxColumns: Long,
)

data class Element2(
    @SerializedName("__typename")
    val typename: String,
    val header: Header9,
    val items: List<Item6>,
)

data class Header9(
    @SerializedName("__typename")
    val typename: String,
    val text: String,
    val subText: Any?,
    val icon: Any?,
    val headerImage: Any?,
)

data class Item6(
    @SerializedName("__typename")
    val typename: String,
    val content: Content3?,
    val contents: List<Content4>?,
)

data class Content3(
    @SerializedName("__typename")
    val typename: String,
    val primary: Primary2?,
    val secondary: Any?,
    val text: String?,
    val markupType: String?,
)

data class Primary2(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val accessibilityLabel: Any?,
    val icon: Any?,
)

data class Content4(
    @SerializedName("__typename")
    val typename: String,
    val primary: Primary3,
    val secondary: Any?,
)

data class Primary3(
    @SerializedName("__typename")
    val typename: String,
    val value: String,
    val accessibilityLabel: Any?,
    val icon: Any?,
)

