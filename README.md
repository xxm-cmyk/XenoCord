# Xenocord

**X-only patches for the official X Android app.**

Xenocord is an unofficial, community-maintained patch bundle for [Morphe](https://morphe.software). It focuses exclusively on X (formerly Twitter). Instagram support and its patch modules are not included.

> Xenocord is not affiliated with, endorsed by, or sponsored by X Corp.

## What it does

Xenocord adds optional patches to the X Android app, such as interface customization, media controls, download options, privacy preferences, and quality-of-life improvements. Available patches and supported X versions are defined by the current source code and generated patch catalogue.

## Use with Morphe

1. Install [Morphe Manager](https://morphe.software).
2. Add Xenocord as a patch source: [Add Xenocord to Morphe](https://morphe.software/add-source?github=xxm-cmyk/XenoCord).
3. Select the X app, provide its original APKM package, and choose the patches you want.
4. Review the selected patches before building and installing the patched app.

Use an original X APKM compatible with the version listed by the patch catalogue. Do not assume every X release is supported.

## Build from source

Requirements: JDK 17 and an internet connection for Gradle dependencies.

```bash
./gradlew clean buildAndroid
```

To regenerate the machine-readable patch catalogue:

```bash
./gradlew generatePatchesList
```

The resulting Morphe patch bundle is written under `patches/build/libs/`.

## Project status

Xenocord is an independent fork being adapted to maintain X support only. The first Xenocord release will be published after the X-only build has been validated.

## Credits and license

Xenocord is derived from [Piko Patches](https://github.com/crimera/piko), originally developed by Crimera and contributors, and uses the [Morphe](https://github.com/MorpheApp) patching ecosystem. Original notices and attribution are retained in [NOTICE](NOTICE).

This project is licensed under **GNU GPL v3.0 or later**. See [LICENSE](LICENSE) for the full license text.
