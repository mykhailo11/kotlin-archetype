package me.programs.providers

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.support.ParameterDeclarations
import java.util.stream.Stream

interface ArgProvider: ArgumentsProvider {

    fun bundle(vararg arguments: Arguments): Stream<Arguments> = Stream.of(*arguments);
    fun arguments(vararg params: Any?): Arguments = Arguments.of(*params);

    fun provide(): Stream<Arguments>

    override fun provideArguments(
        parameters: ParameterDeclarations,
        context: ExtensionContext
    ): Stream<out Arguments> = provide();

}