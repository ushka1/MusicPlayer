# Music Player

## Notes

- Edge-to-edge-layout. Layout extends to device frames, ignoring status bar and bottom navigation.
  You can add insets for these bars.
- [Material theme overrides all colors](https://stackoverflow.com/questions/66531691/android-theme-overrides-all-colors)
- [Android Resources Naming Convention](https://softeq.github.io/XToolkit.WhiteLabel/articles/practices/android-res-naming.html)
    - Resources file names are written in lowercase_underscore.
    - Resource IDs and names are written in lowercase_underscore.
- [ConstraintLayout chains](https://constraintlayout.com/basics/create_chains.html)
- `colorControlNormal` is a theme property and cannot be used in styles.xml (
  look [here](https://stackoverflow.com/questions/41811868/cannot-set-colorcontrolnormal-and-androidtextcolor-in-style)).
  Instead create custom theme just for selected view.