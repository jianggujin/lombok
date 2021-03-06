@lombok.Builder(setterPrefix = "with") @lombok.experimental.Accessors(prefix = {"p", "_"}) class BuilderWithAccessorsWithSetterPrefix {
  public static @java.lang.SuppressWarnings("all") class BuilderWithAccessorsWithSetterPrefixBuilder {
    private @java.lang.SuppressWarnings("all") int plower;
    private @java.lang.SuppressWarnings("all") int upper;
    private @java.lang.SuppressWarnings("all") int foo;
    private @java.lang.SuppressWarnings("all") int _bar;
    @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder withPlower(final int plower) {
      this.plower = plower;
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder withUpper(final int upper) {
      this.upper = upper;
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder withFoo(final int foo) {
      this.foo = foo;
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder with_bar(final int _bar) {
      this._bar = _bar;
      return this;
    }
    public @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefix build() {
      return new BuilderWithAccessorsWithSetterPrefix(plower, upper, foo, _bar);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") java.lang.String toString() {
      return (((((((("BuilderWithAccessorsWithSetterPrefix.BuilderWithAccessorsWithSetterPrefixBuilder(plower=" + this.plower) + ", upper=") + this.upper) + ", foo=") + this.foo) + ", _bar=") + this._bar) + ")");
    }
  }
  private final int plower;
  private final int pUpper;
  private int _foo;
  private int __bar;
  @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefix(final int plower, final int upper, final int foo, final int _bar) {
    super();
    this.plower = plower;
    this.pUpper = upper;
    this._foo = foo;
    this.__bar = _bar;
  }
  public static @java.lang.SuppressWarnings("all") BuilderWithAccessorsWithSetterPrefixBuilder builder() {
    return new BuilderWithAccessorsWithSetterPrefixBuilder();
  }
}
