package com.baronasu.view;

public enum ColorTheme {
    LIGHT,
    DEFAULT,
    DARK;

    public static String getCssPath(ColorTheme colorTheme) {
        switch (colorTheme) {
            case DEFAULT:
                return "css/themeDefault.css";

            case LIGHT:
                return "css/themeLight.css";

            case DARK:
                return "css/themeDark.css";

            default:
                return null;
        }
    }
}
