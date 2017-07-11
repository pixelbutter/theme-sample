# Theme Sample

Demo of supporting multiple themes within an app. Not an exhaustive example, but includes the following capabilities:
* Customizing `android` namespace attributes
* Defining custom theme-specific attributes
* Theme overlays
* Changing themes at runtime

### Android Namespace Customization

// TODO - text colors, foreground, backgrounds

##### Widget Colors

If using AppCompat, ignore `android` namespace (i.e. `colorControlNormal` in place of `android:colorControlNormal`)

Checkbox
* Unchecked: `android:colorControlNormal`
* Checked: `android:colorAccent`
* Ripple: `android:colorControlHighlight`

RadioButton
* Deselected: `android:colorControlNormal`
* Selected: `android:colorAccent`
* Ripple: `android:colorControlHighlight`

Switch (use SwitchCompat for theme colors to be respected)
* Off Thumb: `colorSwitchThumbNormal`
* Off Track: `android:colorForeground` at opacity 30%
* On Thumb: `colorControlActivated` (defaults to `colorAccent`)
* On Track: `colorControlActivated` at 30% transparency (defaults to `colorAccent`)
* Ripple: `android:colorControlHighlight`

### Defining Custom Attributes

// TODO - Strings, assets, styles

### Limitations

// TODO - backwards compat

### Resources

##### Designing themes
[Coolors.co - The super fast color schemes generator](https://coolors.co/)  
[Material.io - Color Tool](https://material.io/color)

##### Feature Image Credits
[Upsplash - Karsten Würth](https://unsplash.com/photos/lsJ9jHKIqHg)  
[Upsplash - Angelina Odemchuk](https://unsplash.com/photos/lp0IFw6YqZg)  
[Upsplash - Clay Banks](https://unsplash.com/photos/hwLAI5lRhdM)  