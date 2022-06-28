package templates

import groovy.text.StreamingTemplateEngine

def text = '''\
Dear <% out.print firstname %> ${lastname},

We <% if (accepted) out.print 'are pleased' else out.print 'regret' %> \
to inform you that your paper entitled
'$title' was ${ accepted ? 'accepted' : 'rejected' }.

The conference committee.'''

def template = new StreamingTemplateEngine().createTemplate(text)

def binding = [
        firstname : "Grace",
        lastname  : "Hopper",
        accepted  : true,
        title     : 'Groovy for COBOL programmers'
]

String response = template.make(binding)

print response
assert response == '''Dear Grace Hopper,

We are pleased to inform you that your paper entitled
'Groovy for COBOL programmers' was accepted.

The conference committee.'''
