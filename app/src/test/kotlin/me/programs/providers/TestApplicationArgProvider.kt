package me.programs.providers

class TestApplicationArgProvider: ArgProvider {

    override fun provide() = bundle(
        arguments(1, 1, 2),
        arguments(5, 3, 8),
        arguments(22, 35, 57),
    );

}