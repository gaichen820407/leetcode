Basic GUI conception

Java production version api has two package named AWT and Swing, both of them can make graphic interface program.

The different is that AWT uses the window utility supplied by OS, the window graphic program will be same as the OS window,

Swing's window is drawn by JAVA programming language, will be same style on every OS.

GUI programming needs to care about some parts:

1.widget: the button object, the checkbox object, the textarea object......

2.layout: the widget in the window's style

3.event: event can fire by communicating with widgets

layout management by following rulse:

BorderLayout(區域式版面配置): cut the windows to five parts. The JFrame default layout

FlowLayout(流動式版面配置): the flow layout will put each widget in same row

CardLayout(卡片式版面配置)

GridLayout(格子式版面配置)

GridBagLayout(帶狀式版面配置)

BoxLayout(盒子式版面配置)
