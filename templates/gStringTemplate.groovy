package templates

import groovy.text.GStringTemplateEngine

def f = new File('test.template')
def engine = new GStringTemplateEngine()
def binding = [
        firstname : "Grace",
        lastname  : "Hopper",
        city: "New York",
        month  : "December",
        signed     : "Groovy-Dev"
]

def template = engine.createTemplate(f).make(binding)
println template.toString()
