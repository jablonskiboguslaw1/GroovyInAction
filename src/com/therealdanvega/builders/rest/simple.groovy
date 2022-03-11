package com.therealdanvega.builders.rest

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File('data/dynamic-email.txt'))


Map bindings = [
        firstName    : "Dan",
        lastName     : "Vega",
        commits      : 27,
        repositories: [
                [name: "GrooveInAction", url: 'https://github.com/jablonskiboguslaw1/GroovyInAction'],
                [name: "Spring5webapp", url: 'https://github.com/jablonskiboguslaw1/Spring5webapp'],
                [name: "DI-project", url: 'https://github.com/jablonskiboguslaw1/DI-project']
        ]
]
println template.make(bindings)